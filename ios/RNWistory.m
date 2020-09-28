#import "RNWistory.h"
#import "RNWistoryConfig.h"

@implementation RNWistory

- (void)initWithToken:(NSString *) companyToken withUserToken:(NSString *)userToken {
    RNWistoryConfig.sharedInstance.companyToken = companyToken;
    RNWistoryConfig.sharedInstance.userToken = userToken;
}

- (dispatch_queue_t)methodQueue{
    return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(init: (NSString *) companyToken userToken: (NSString*) userToken) {
    [self initWithToken:companyToken withUserToken:userToken];
}

RCT_EXPORT_MODULE()

@end
