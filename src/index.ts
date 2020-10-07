import {NativeModules} from 'react-native';

export * from './components/WistoryView';

const {RNWistory: NativeWistoryModule} = NativeModules;

export class Wistory {
  static init(companyToken: string, userToken?: string, apiUrl?: string) {
    NativeWistoryModule.init(companyToken, userToken, apiUrl);
  }
}
