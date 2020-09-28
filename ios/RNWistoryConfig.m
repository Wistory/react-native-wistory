#import "RNWistoryConfig.h"

@implementation RNWistoryConfig
+ (instancetype)sharedInstance
{
  static RNWistoryConfig *sharedInstance = nil;
  static dispatch_once_t onceToken;
  dispatch_once(&onceToken, ^{
    sharedInstance = [[RNWistoryConfig alloc] init];
  });
  return sharedInstance;
}
@end
