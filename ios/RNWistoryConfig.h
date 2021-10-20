#import <Foundation/Foundation.h>
#import "RNWistory.h"
@import UIKit;

@interface RNWistoryConfig : NSObject

+ (instancetype)sharedInstance;
@property (strong, nonatomic) UIViewController *reactViewController;
@property (strong, nonatomic) NSString *companyToken;
@property (strong, nonatomic) NSString *userToken;
@property (strong, nonatomic) NSString *apiUrl;
@property (strong, nonatomic) NSString *favoriteString;
@property (strong, nonatomic) RNWistory *wistory;

@end
