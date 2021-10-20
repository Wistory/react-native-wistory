import {ViewProps, ViewStyle} from 'react-native';

export interface WistoryViewProps extends ViewProps {
  wrapperStyle?: ViewStyle;
  onEvent: (...args: any[]) => void;
}
