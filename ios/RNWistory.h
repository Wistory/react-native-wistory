#import <React/RCTBridgeModule.h>
#import "RNWistory.h"
#import <React/RCTEventEmitter.h>

@interface RNWistory : RCTEventEmitter <RCTBridgeModule>

-(void) initWithToken:(NSString *) companyToken withUserToken: (NSString*) userToken;
-(void)onEvent: (NSString*) action withValue:(NSString*) value;

@end
