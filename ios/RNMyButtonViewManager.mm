//
//  RNMyButtonViewManager.m
//  MyAppFabricEg
//
//  Created by TransformHub on 14/07/22.
//

#import <Foundation/Foundation.h>
#import <React/RCTViewManager.h>

@interface RNMyButtonViewManager : RCTViewManager
@end
 
@implementation RNMyButtonViewManager

RCT_EXPORT_MODULE(MyButtonView)
RCT_EXPORT_VIEW_PROPERTY(text, NSString)

@end
