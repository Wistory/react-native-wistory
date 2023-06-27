import { ViewProps, ViewStyle } from 'react-native';
export interface WistoryViewProps extends ViewProps {
    wrapperStyle?: ViewStyle;
    onEvent: (data: {
        action: string;
        value: string;
    }) => void;
}
