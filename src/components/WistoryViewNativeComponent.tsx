import {requireNativeComponent} from 'react-native';
import {WistoryViewProps} from './WistoryViewProps';

export const WistoryViewNativeComponent = requireNativeComponent<
  WistoryViewProps
>('WistoryView');
