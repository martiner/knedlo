/* This file was generated by the ServiceGenerator.
 * The ServiceGenerator is Copyright (c) 2013 Google Inc.
 */

//
//  GTLKnedloArticle.m
//

// ----------------------------------------------------------------------------
// NOTE: This file is generated from Google APIs Discovery Service.
// Service:
//   knedlo/v1
// Description:
//   This is an API
// Classes:
//   GTLKnedloArticle (0 custom class methods, 7 custom properties)

#import "GTLKnedloArticle.h"

// ----------------------------------------------------------------------------
//
//   GTLKnedloArticle
//

@implementation GTLKnedloArticle
@dynamic category, descriptionProperty, image, link, source, text, title;

+ (NSDictionary *)propertyToJSONKeyMap {
  NSDictionary *map =
    [NSDictionary dictionaryWithObject:@"description"
                                forKey:@"descriptionProperty"];
  return map;
}

@end
