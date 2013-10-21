/* This file was generated by the ServiceGenerator.
 * The ServiceGenerator is Copyright (c) 2013 Google Inc.
 */

//
//  GTLKnedloLogger.h
//

// ----------------------------------------------------------------------------
// NOTE: This file is generated from Google APIs Discovery Service.
// Service:
//   knedlo/v1
// Description:
//   This is an API
// Classes:
//   GTLKnedloLogger (0 custom class methods, 5 custom properties)

#if GTL_BUILT_AS_FRAMEWORK
  #import "GTL/GTLObject.h"
#else
  #import "GTLObject.h"
#endif

@class GTLKnedloFilter;
@class GTLKnedloHandler;
@class GTLKnedloLevel;
@class GTLKnedloLogger;

// ----------------------------------------------------------------------------
//
//   GTLKnedloLogger
//

@interface GTLKnedloLogger : GTLObject
@property (retain) GTLKnedloFilter *filter;
@property (retain) NSArray *handlers;  // of GTLKnedloHandler
@property (retain) GTLKnedloLevel *level;
@property (retain) GTLKnedloLogger *parent;
@property (retain) NSNumber *useParentHandlers;  // boolValue
@end