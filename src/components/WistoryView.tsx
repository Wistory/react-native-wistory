import React from 'react';
import {requireNativeComponent, NativeModules, ViewProps} from 'react-native';

const {RNWistory: NativeWistoryModule} = NativeModules;

export interface WistoryViewProps extends ViewProps {}

const WistoryViewNativeComponent = requireNativeComponent<WistoryViewProps>(
  'WistoryView',
);

export class WistoryView extends React.Component<WistoryViewProps> {
  static defaultProps = {};

  public static init(companyToken: string, userToken?: string) {
    NativeWistoryModule.init(companyToken, userToken);
  }

  render() {
    return <WistoryViewNativeComponent {...this.props} />;
  }
}
