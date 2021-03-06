package cz.czechhackathon.knedlo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.appspot.knedloreader.knedlo.Knedlo;
import com.appspot.knedloreader.knedlo.model.Article;
import com.example.android.swipedismiss.SwipeDismissListViewTouchListener;

import cz.czechhackathon.knedlo.adapter.FeedAdapter;
import cz.czechhackathon.knedlo.domain.FeedItem;

/**
 * Fragment for displaying feed
 * Swipe-to-dismiss based on https://github.com/shmoula/Android-SwipeToDismiss
 * 
 * @author shmoula
 * 
 */
public class FeedFragment extends Fragment implements OnItemClickListener {
	public static final String TAG = "FeedFragment";
	private static final int LIST_TOP_OFFSET = 0;  // offest in px, when list is not at the top of the screen

	private RelativeLayout rlRootLayout;
	private ListView lvFeed;
	private FeedAdapter feedAdapter;
	
	private ImageView ivTray;			// View on left side and its parameters
	private LayoutParams trayParams;

	private ImageView ivRil;			// View on right side and its parameters
	private LayoutParams rilParams;
	
	private boolean clickListenerEnabled = true;  // should listItem respond on click?

	private int iconSize = 64;          // predefined value TODO: update at the runtime - height of list item (already there)
	private int layoutWidth;
	
	private Knedlo knedloService;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_feed, container, false);

		rlRootLayout = (RelativeLayout) view.findViewById(R.id.root_layout);
		lvFeed = (ListView) view.findViewById(R.id.feed_list);
		lvFeed.setOnItemClickListener(this);

		return view;
	}

	@Override
	public void onResume() {
		super.onResume();

		// initialization of feedAdapter - empty set after start
		feedAdapter = new FeedAdapter(getActivity(), new ArrayList<FeedItem>());
		lvFeed.setAdapter(feedAdapter);
		
		// fetching articles on background
		// TODO: server fetching temporarily disabled, because of backend is offline
		//new QueryArticlesTask().execute();
		
		// simple mock data filling starts here -------------
		feedAdapter.clear();
		for(int i=0; i< 20; i++) {
			FeedItem item = new FeedItem();
			item.setTitle("Simple title " + i);
			item.setPerex("Some perex text for item no. " + i);
			item.setText("Article content - it should be very very long :D");
			if(i%2 == 1)
				item.setImageUrl("foo");
			feedAdapter.add(item);
		}
		feedAdapter.notifyDataSetChanged();
		// simple mock data endss here -------------

		setupSwipeActionIcons();
		
		// Create a ListView-specific touch listener. ListViews are given
		// special treatment because
		// by default they handle touches for their list items... i.e. they're
		// in charge of drawing
		// the pressed state (the list selector), handling list item clicks,
		// etc.
		SwipeDismissListViewTouchListener touchListener = new SwipeDismissListViewTouchListener(
				lvFeed,
				new SwipeDismissListViewTouchListener.DismissCallbacks() {
					@Override
					public boolean canDismiss(int position) {
						return true;
					}

					@Override
					public void onDismiss(ListView listView,
							int[] reverseSortedPositions) {
						for (int position : reverseSortedPositions) {
							feedAdapter.remove(feedAdapter.getItem(position));
						}
						feedAdapter.notifyDataSetChanged();
					}

					@Override
					public void onItemMove(float deltaX, int position) {
						int itemTop = feedAdapter.getVerticalItemLocationOnScreen(position) + LIST_TOP_OFFSET;

						// consideration which item to show
						// TODO: alpha based on swipe length
						if (deltaX < 0)
							showTrayIcon(itemTop, iconSize);
						else if (deltaX > 0)
							showRilIcon(itemTop, iconSize);
					}

					@Override
					public void onActionUp(int position) {
						ivTray.setVisibility(View.GONE);
						ivRil.setVisibility(View.GONE);
					}
				});

		lvFeed.setOnTouchListener(touchListener);

		// Setting this scroll listener is required to ensure that during
		// ListView scrolling, we don't look for swipes.
		lvFeed.setOnScrollListener(touchListener.makeScrollListener());
	}
	
	/**
	 * Creates observer for getting layout width and setup swipe action images
	 */
	private void setupSwipeActionIcons() {
		lvFeed.getViewTreeObserver().addOnGlobalLayoutListener(
				new OnGlobalLayoutListener() {
					@Override
					public void onGlobalLayout() {
						layoutWidth = lvFeed.getWidth();
					}
				});
		
		// ImageView for the left side
		ivTray = createImageView(R.drawable.delete);
		trayParams = new LayoutParams(iconSize, iconSize);
		trayParams.leftMargin = 0;
		rlRootLayout.addView(ivTray, trayParams);

		// ImageView for the right side
		ivRil = createImageView(R.drawable.addto);
		rilParams = new LayoutParams(iconSize, iconSize);
		rlRootLayout.addView(ivRil, rilParams);
	}
	
	/**
	 * Creates colored placeholder for swipe action icon
	 * @param drawable
	 * @return
	 */
	private ImageView createImageView(int drawable) {
		ImageView iv = new ImageView(getActivity());

		iv.setImageDrawable(getResources().getDrawable(drawable));
		iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
		iv.setPadding(8, 8, 8, 8);
		iv.setVisibility(View.GONE);

		return iv;
	}
	
	/**
	 * Shows trash icon for swiping left
	 * @param relativeY vertical position in px
	 * @param iconSize
	 */
	private void showTrayIcon(int relativeY, int iconSize) {
		ivTray.setVisibility(View.VISIBLE);
		ivRil.setVisibility(View.GONE);
		trayParams.topMargin = relativeY;
	}

	/**
	 * Shows read it later icon for swiping right
	 * @param relativeY vertical positoin in px
	 * @param iconSize
	 */
	private void showRilIcon(int relativeY, int iconSize) {
		ivRil.setVisibility(View.VISIBLE);
		ivTray.setVisibility(View.GONE);
		rilParams.leftMargin = layoutWidth - iconSize;
		rilParams.topMargin = relativeY;
	}
	
	/**
	 * Enables or disableslist item onClick responsibilty
	 * Exists because of own custom touchListener implementation (overlayed drawer may affect items in list) 
	 * @param clickListenerEnabled
	 */
	public void setClickListenerEnabled(boolean clickListenerEnabled) {
		this.clickListenerEnabled = clickListenerEnabled;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		if(!clickListenerEnabled)
			return;
		
		FeedItem item = feedAdapter.getItem(position);

		// starts new activity for display article content
		Intent intent = new Intent(getActivity().getBaseContext(), DetailActivity.class);
		intent.putExtra(DetailActivity.EXTRA_ITEM, item);
		startActivity(intent);
	}

	/**
	 * setter for knedlo service
	 * @param knedloService
	 */
	public void setKnedloService(Knedlo knedloService) {
		this.knedloService = knedloService;
	}

	/**
	 * Asynchronous task for getting list of articles
	 *
	 */
	private class QueryArticlesTask extends AsyncTask<Void, Void, List<Article>> {
		protected List<Article> doInBackground(Void... params) {
			List<Article> articleList = null;
			
			try {
				articleList = knedloService.feed().execute().getItems();
			} catch (IOException e) {
			}
			return articleList;
		}

		protected void onPostExecute(List<Article> articleList) {
			if(articleList == null || articleList.isEmpty())
				return;
			
			feedAdapter.clear();
			
			for(Article article : articleList) {
				FeedItem item = new FeedItem();
				
				item.setTitle(article.getTitle());
				item.setPerex(article.getDescription());
				item.setImageUrl(article.getImage());
				item.setText(article.getText());
				
				feedAdapter.insert(item, feedAdapter.getCount());
			}
			
			feedAdapter.notifyDataSetChanged();
		}
	}
}
