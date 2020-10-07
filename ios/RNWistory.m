#import "RNWistory.h"
#import "RNWistoryConfig.h"

@implementation RNWistory

- (void)initWithToken:(NSString *) companyToken withUserToken:(NSString *)userToken withApiUrl:(NSString*) apiUrl {
    RNWistoryConfig.sharedInstance.companyToken = companyToken;
    RNWistoryConfig.sharedInstance.userToken = userToken;
    RNWistoryConfig.sharedInstance.apiUrl = apiUrl;
}

- (dispatch_queue_t)methodQueue{
    return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(init: (NSString *) companyToken userToken: (NSString*) userToken apiUrl: (NSString*) apiUrl) {
    [self initWithToken:companyToken withUserToken:userToken withApiUrl:apiUrl];
}

RCT_EXPORT_MODULE()

@end
