//
//  RNMyButtonView.m
//  MyAppFabricEg
//
//  Created by TransformHub on 14/07/22.
//

#import <Foundation/Foundation.h>
#import "RNMyButtonView.h"

#import <react/renderer/components/RNMyButtonViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/RNMyButtonViewSpec/EventEmitters.h>
#import <react/renderer/components/RNMyButtonViewSpec/Props.h>
#import <react/renderer/components/RNMyButtonViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabric/React-RCTFabric-umbrella.h"

using namespace facebook::react;

@interface RNMyButtonView () <RCTMyButtonViewViewProtocol>

@end

@implementation RNMyButtonView {
  UIView *_view;
  UIButton *_button;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
  return concreteComponentDescriptorProvider<MyButtonViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const MyButtonViewProps>();
    _props = defaultProps;
    
    _view = [[UIView alloc] init];
    _view.backgroundColor = [UIColor redColor];
    _button = [[UIButton alloc] init];
    //    _label.text = @"Initial value";
    [_view addSubview:_button];
    
    _button.translatesAutoresizingMaskIntoConstraints = false;
    [NSLayoutConstraint activateConstraints:@[
      [_button.leadingAnchor constraintEqualToAnchor:_view.leadingAnchor],
      [_button.topAnchor constraintEqualToAnchor:_view.topAnchor],
      [_button.trailingAnchor constraintEqualToAnchor:_view.trailingAnchor],
      [_button.bottomAnchor constraintEqualToAnchor:_view.bottomAnchor],
    ]];
    
    //    [_button setHighlighted:YES];
    //    [_button sendActionsForControlEvents:UIControlEventTouchUpInside];
    //    [_button performSelector:@selector(setHighlighted:) withObject:NO afterDelay:0];
    //    [_button performSelector:@selector(setHighlighted)];
    [_button addTarget:self
                action:@selector(setHighlighted)
      forControlEvents:UIControlEventTouchUpInside];
    self.contentView = _view;
  }
  
  return self;
}

-(void)setHighlighted
{
  // do stuff
  
  if (_eventEmitter != nullptr) {
    
    std::dynamic_pointer_cast<const facebook::react::MyButtonViewEventEmitter>(_eventEmitter)->onClickHandler(facebook::react::MyButtonViewEventEmitter::OnClickHandler{
      .text = "Hello Pritish"
//      .text = std::make_shared<std::string>("Marius")
    });
  }
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
  const auto &oldViewProps = *std::static_pointer_cast<MyButtonViewProps const>(_props);
  const auto &newViewProps = *std::static_pointer_cast<MyButtonViewProps const>(props);
  
  if (oldViewProps.text != newViewProps.text) {
    NSString *buttonText = [[NSString alloc] initWithUTF8String: newViewProps.text.c_str()];
    [_button setTitle:buttonText forState:UIControlStateNormal];
  }
  
  [super updateProps:props oldProps:oldProps];
}

Class<RCTComponentViewProtocol> MyButtonViewCls(void)
{
  return RNMyButtonView.class;
}

@end


















































