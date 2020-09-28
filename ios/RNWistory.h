#import <React/RCTBridgeModule.h>
#import "RNWistory.h"

@interface RNWistory : NSObject <RCTBridgeModule>

-(void) initWithToken:(NSString *) companyToken withUserToken: (NSString*) userToken;

@end
