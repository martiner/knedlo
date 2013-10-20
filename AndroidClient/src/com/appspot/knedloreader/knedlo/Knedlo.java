/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-09-16 16:01:30 UTC)
 * on 2013-10-20 at 07:52:16 UTC 
 * Modify at your own risk.
 */

package com.appspot.knedloreader.knedlo;

/**
 * Service definition for Knedlo (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link KnedloRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Knedlo extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.17.0-rc of the knedlo library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  //public static final String DEFAULT_ROOT_URL = "https://knedloreader.appspot.com/_ah/api/";
  public static final String DEFAULT_ROOT_URL = "http://192.168.218.98:8888/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "knedlo/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Knedlo(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Knedlo(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Endpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Knedlo knedlo = new Knedlo(...);}
   *   {@code Knedlo.Endpoint.List request = knedlo.endpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Endpoint endpoint() {
    return new Endpoint();
  }

  /**
   * The "endpoint" collection of methods.
   */
  public class Endpoint {

    /**
     * Create a request for the method "endpoint.categoryDao".
     *
     * This request holds the parameters needed by the knedlo server.  After setting any optional
     * parameters, call the {@link CategoryDao#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public CategoryDao categoryDao() throws java.io.IOException {
      CategoryDao result = new CategoryDao();
      initialize(result);
      return result;
    }

    public class CategoryDao extends KnedloRequest<com.appspot.knedloreader.knedlo.model.CategoryDao> {

      private static final String REST_PATH = "categoryDao";

      /**
       * Create a request for the method "endpoint.categoryDao".
       *
       * This request holds the parameters needed by the the knedlo server.  After setting any optional
       * parameters, call the {@link CategoryDao#execute()} method to invoke the remote operation. <p>
       * {@link
       * CategoryDao#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected CategoryDao() {
        super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.CategoryDao.class);
      }

      @Override
      public CategoryDao setAlt(java.lang.String alt) {
        return (CategoryDao) super.setAlt(alt);
      }

      @Override
      public CategoryDao setFields(java.lang.String fields) {
        return (CategoryDao) super.setFields(fields);
      }

      @Override
      public CategoryDao setKey(java.lang.String key) {
        return (CategoryDao) super.setKey(key);
      }

      @Override
      public CategoryDao setOauthToken(java.lang.String oauthToken) {
        return (CategoryDao) super.setOauthToken(oauthToken);
      }

      @Override
      public CategoryDao setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (CategoryDao) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public CategoryDao setQuotaUser(java.lang.String quotaUser) {
        return (CategoryDao) super.setQuotaUser(quotaUser);
      }

      @Override
      public CategoryDao setUserIp(java.lang.String userIp) {
        return (CategoryDao) super.setUserIp(userIp);
      }

      @Override
      public CategoryDao set(String parameterName, Object value) {
        return (CategoryDao) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "endpoint.feedService".
     *
     * This request holds the parameters needed by the knedlo server.  After setting any optional
     * parameters, call the {@link FeedService#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public FeedService feedService() throws java.io.IOException {
      FeedService result = new FeedService();
      initialize(result);
      return result;
    }

    public class FeedService extends KnedloRequest<com.appspot.knedloreader.knedlo.model.FeedService> {

      private static final String REST_PATH = "feedService";

      /**
       * Create a request for the method "endpoint.feedService".
       *
       * This request holds the parameters needed by the the knedlo server.  After setting any optional
       * parameters, call the {@link FeedService#execute()} method to invoke the remote operation. <p>
       * {@link
       * FeedService#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected FeedService() {
        super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.FeedService.class);
      }

      @Override
      public FeedService setAlt(java.lang.String alt) {
        return (FeedService) super.setAlt(alt);
      }

      @Override
      public FeedService setFields(java.lang.String fields) {
        return (FeedService) super.setFields(fields);
      }

      @Override
      public FeedService setKey(java.lang.String key) {
        return (FeedService) super.setKey(key);
      }

      @Override
      public FeedService setOauthToken(java.lang.String oauthToken) {
        return (FeedService) super.setOauthToken(oauthToken);
      }

      @Override
      public FeedService setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (FeedService) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public FeedService setQuotaUser(java.lang.String quotaUser) {
        return (FeedService) super.setQuotaUser(quotaUser);
      }

      @Override
      public FeedService setUserIp(java.lang.String userIp) {
        return (FeedService) super.setUserIp(userIp);
      }

      @Override
      public FeedService set(String parameterName, Object value) {
        return (FeedService) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "endpoint.log".
     *
     * This request holds the parameters needed by the knedlo server.  After setting any optional
     * parameters, call the {@link Log#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public Log log() throws java.io.IOException {
      Log result = new Log();
      initialize(result);
      return result;
    }

    public class Log extends KnedloRequest<com.appspot.knedloreader.knedlo.model.Logger> {

      private static final String REST_PATH = "log";

      /**
       * Create a request for the method "endpoint.log".
       *
       * This request holds the parameters needed by the the knedlo server.  After setting any optional
       * parameters, call the {@link Log#execute()} method to invoke the remote operation. <p> {@link
       * Log#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected Log() {
        super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.Logger.class);
      }

      @Override
      public Log setAlt(java.lang.String alt) {
        return (Log) super.setAlt(alt);
      }

      @Override
      public Log setFields(java.lang.String fields) {
        return (Log) super.setFields(fields);
      }

      @Override
      public Log setKey(java.lang.String key) {
        return (Log) super.setKey(key);
      }

      @Override
      public Log setOauthToken(java.lang.String oauthToken) {
        return (Log) super.setOauthToken(oauthToken);
      }

      @Override
      public Log setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Log) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Log setQuotaUser(java.lang.String quotaUser) {
        return (Log) super.setQuotaUser(quotaUser);
      }

      @Override
      public Log setUserIp(java.lang.String userIp) {
        return (Log) super.setUserIp(userIp);
      }

      @Override
      public Log set(String parameterName, Object value) {
        return (Log) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "endpoint.userDao".
     *
     * This request holds the parameters needed by the knedlo server.  After setting any optional
     * parameters, call the {@link UserDao#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public UserDao userDao() throws java.io.IOException {
      UserDao result = new UserDao();
      initialize(result);
      return result;
    }

    public class UserDao extends KnedloRequest<com.appspot.knedloreader.knedlo.model.UserDao> {

      private static final String REST_PATH = "userDao";

      /**
       * Create a request for the method "endpoint.userDao".
       *
       * This request holds the parameters needed by the the knedlo server.  After setting any optional
       * parameters, call the {@link UserDao#execute()} method to invoke the remote operation. <p>
       * {@link
       * UserDao#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected UserDao() {
        super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.UserDao.class);
      }

      @Override
      public UserDao setAlt(java.lang.String alt) {
        return (UserDao) super.setAlt(alt);
      }

      @Override
      public UserDao setFields(java.lang.String fields) {
        return (UserDao) super.setFields(fields);
      }

      @Override
      public UserDao setKey(java.lang.String key) {
        return (UserDao) super.setKey(key);
      }

      @Override
      public UserDao setOauthToken(java.lang.String oauthToken) {
        return (UserDao) super.setOauthToken(oauthToken);
      }

      @Override
      public UserDao setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UserDao) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UserDao setQuotaUser(java.lang.String quotaUser) {
        return (UserDao) super.setQuotaUser(quotaUser);
      }

      @Override
      public UserDao setUserIp(java.lang.String userIp) {
        return (UserDao) super.setUserIp(userIp);
      }

      @Override
      public UserDao set(String parameterName, Object value) {
        return (UserDao) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "endpoint.userService".
     *
     * This request holds the parameters needed by the knedlo server.  After setting any optional
     * parameters, call the {@link UserService#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public UserService userService() throws java.io.IOException {
      UserService result = new UserService();
      initialize(result);
      return result;
    }

    public class UserService extends KnedloRequest<com.appspot.knedloreader.knedlo.model.UserService> {

      private static final String REST_PATH = "userService";

      /**
       * Create a request for the method "endpoint.userService".
       *
       * This request holds the parameters needed by the the knedlo server.  After setting any optional
       * parameters, call the {@link UserService#execute()} method to invoke the remote operation. <p>
       * {@link
       * UserService#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected UserService() {
        super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.UserService.class);
      }

      @Override
      public UserService setAlt(java.lang.String alt) {
        return (UserService) super.setAlt(alt);
      }

      @Override
      public UserService setFields(java.lang.String fields) {
        return (UserService) super.setFields(fields);
      }

      @Override
      public UserService setKey(java.lang.String key) {
        return (UserService) super.setKey(key);
      }

      @Override
      public UserService setOauthToken(java.lang.String oauthToken) {
        return (UserService) super.setOauthToken(oauthToken);
      }

      @Override
      public UserService setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (UserService) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public UserService setQuotaUser(java.lang.String quotaUser) {
        return (UserService) super.setQuotaUser(quotaUser);
      }

      @Override
      public UserService setUserIp(java.lang.String userIp) {
        return (UserService) super.setUserIp(userIp);
      }

      @Override
      public UserService set(String parameterName, Object value) {
        return (UserService) super.set(parameterName, value);
      }
    }

  }

  /**
   * Create a request for the method "action".
   *
   * This request holds the parameters needed by the knedlo server.  After setting any optional
   * parameters, call the {@link Action#execute()} method to invoke the remote operation.
   *
   * @param action
   * @param articleLink
   * @return the request
   */
  public Action action(java.lang.String action, java.lang.String articleLink) throws java.io.IOException {
    Action result = new Action(action, articleLink);
    initialize(result);
    return result;
  }

  public class Action extends KnedloRequest<com.appspot.knedloreader.knedlo.model.BadgeCollection> {

    private static final String REST_PATH = "action";

    /**
     * Create a request for the method "action".
     *
     * This request holds the parameters needed by the the knedlo server.  After setting any optional
     * parameters, call the {@link Action#execute()} method to invoke the remote operation. <p> {@link
     * Action#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param action
     * @param articleLink
     * @since 1.13
     */
    protected Action(java.lang.String action, java.lang.String articleLink) {
      super(Knedlo.this, "POST", REST_PATH, null, com.appspot.knedloreader.knedlo.model.BadgeCollection.class);
      this.action = com.google.api.client.util.Preconditions.checkNotNull(action, "Required parameter action must be specified.");
      this.articleLink = com.google.api.client.util.Preconditions.checkNotNull(articleLink, "Required parameter articleLink must be specified.");
    }

    @Override
    public Action setAlt(java.lang.String alt) {
      return (Action) super.setAlt(alt);
    }

    @Override
    public Action setFields(java.lang.String fields) {
      return (Action) super.setFields(fields);
    }

    @Override
    public Action setKey(java.lang.String key) {
      return (Action) super.setKey(key);
    }

    @Override
    public Action setOauthToken(java.lang.String oauthToken) {
      return (Action) super.setOauthToken(oauthToken);
    }

    @Override
    public Action setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Action) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Action setQuotaUser(java.lang.String quotaUser) {
      return (Action) super.setQuotaUser(quotaUser);
    }

    @Override
    public Action setUserIp(java.lang.String userIp) {
      return (Action) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String action;

    /**

     */
    public java.lang.String getAction() {
      return action;
    }

    public Action setAction(java.lang.String action) {
      this.action = action;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String articleLink;

    /**

     */
    public java.lang.String getArticleLink() {
      return articleLink;
    }

    public Action setArticleLink(java.lang.String articleLink) {
      this.articleLink = articleLink;
      return this;
    }

    @Override
    public Action set(String parameterName, Object value) {
      return (Action) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "badges".
   *
   * This request holds the parameters needed by the knedlo server.  After setting any optional
   * parameters, call the {@link Badges#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Badges badges() throws java.io.IOException {
    Badges result = new Badges();
    initialize(result);
    return result;
  }

  public class Badges extends KnedloRequest<com.appspot.knedloreader.knedlo.model.BadgeCollection> {

    private static final String REST_PATH = "badges";

    /**
     * Create a request for the method "badges".
     *
     * This request holds the parameters needed by the the knedlo server.  After setting any optional
     * parameters, call the {@link Badges#execute()} method to invoke the remote operation. <p> {@link
     * Badges#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Badges() {
      super(Knedlo.this, "GET", REST_PATH, null, com.appspot.knedloreader.knedlo.model.BadgeCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Badges setAlt(java.lang.String alt) {
      return (Badges) super.setAlt(alt);
    }

    @Override
    public Badges setFields(java.lang.String fields) {
      return (Badges) super.setFields(fields);
    }

    @Override
    public Badges setKey(java.lang.String key) {
      return (Badges) super.setKey(key);
    }

    @Override
    public Badges setOauthToken(java.lang.String oauthToken) {
      return (Badges) super.setOauthToken(oauthToken);
    }

    @Override
    public Badges setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Badges) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Badges setQuotaUser(java.lang.String quotaUser) {
      return (Badges) super.setQuotaUser(quotaUser);
    }

    @Override
    public Badges setUserIp(java.lang.String userIp) {
      return (Badges) super.setUserIp(userIp);
    }

    @Override
    public Badges set(String parameterName, Object value) {
      return (Badges) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "feed".
   *
   * This request holds the parameters needed by the knedlo server.  After setting any optional
   * parameters, call the {@link Feed#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Feed feed() throws java.io.IOException {
    Feed result = new Feed();
    initialize(result);
    return result;
  }

  public class Feed extends KnedloRequest<com.appspot.knedloreader.knedlo.model.ArticleCollection> {

    private static final String REST_PATH = "feed";

    /**
     * Create a request for the method "feed".
     *
     * This request holds the parameters needed by the the knedlo server.  After setting any optional
     * parameters, call the {@link Feed#execute()} method to invoke the remote operation. <p> {@link
     * Feed#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Feed() {
      super(Knedlo.this, "GET", REST_PATH, null, com.appspot.knedloreader.knedlo.model.ArticleCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Feed setAlt(java.lang.String alt) {
      return (Feed) super.setAlt(alt);
    }

    @Override
    public Feed setFields(java.lang.String fields) {
      return (Feed) super.setFields(fields);
    }

    @Override
    public Feed setKey(java.lang.String key) {
      return (Feed) super.setKey(key);
    }

    @Override
    public Feed setOauthToken(java.lang.String oauthToken) {
      return (Feed) super.setOauthToken(oauthToken);
    }

    @Override
    public Feed setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Feed) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Feed setQuotaUser(java.lang.String quotaUser) {
      return (Feed) super.setQuotaUser(quotaUser);
    }

    @Override
    public Feed setUserIp(java.lang.String userIp) {
      return (Feed) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer page;

    /**

     */
    public java.lang.Integer getPage() {
      return page;
    }

    public Feed setPage(java.lang.Integer page) {
      this.page = page;
      return this;
    }

    @Override
    public Feed set(String parameterName, Object value) {
      return (Feed) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Knedlo}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Knedlo}. */
    @Override
    public Knedlo build() {
      return new Knedlo(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link KnedloRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setKnedloRequestInitializer(
        KnedloRequestInitializer knedloRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(knedloRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
