#import "RNWistory.h"
#import "RNWistoryConfig.h"

@implementation RNWistory

- (NSArray<NSString *> *)supportedEvents {
    return @[@"onEvent"];
}

- (void)initWithToken:(NSString *) companyToken withUserToken:(NSString *)userToken withApiUrl:(NSString*) apiUrl withFavoriteString:favoriteString{
    RNWistoryConfig.sharedInstance.companyToken = companyToken;
    RNWistoryConfig.sharedInstance.userToken = userToken;
    RNWistoryConfig.sharedInstance.apiUrl = apiUrl;
    RNWistoryConfig.sharedInstance.favoriteString = favoriteString;
    RNWistoryConfig.sharedInstance.wistory = self;
}

- (dispatch_queue_t)methodQueue{
    return dispatch_get_main_queue();
}

-(void)onEvent: (NSString*) action withValue:(NSString*) value {
    [self sendEventWithName:@"onEvent" body:@{@"action": action, @"value": value }];
}
RCT_EXPORT_METHOD(init: (NSString *) companyToken userToken: (NSString*) userToken apiUrl: (NSString*) apiUrl favoriteString: (NSString*) favoriteString) {
    [self initWithToken:companyToken withUserToken:userToken withApiUrl:apiUrl withFavoriteString:favoriteString];
}

RCT_EXPORT_MODULE()

@end
