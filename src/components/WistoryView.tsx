import React, {useMemo} from 'react';
import {StyleSheet, View} from 'react-native';
import {WistoryViewProps} from './WistoryViewProps';
import {WistoryViewNativeComponent} from './WistoryViewNativeComponent';

const styles = StyleSheet.create({
  wrapperStyle: {
    width: '100%',
    height: 98,
  },
  view: {
    flex: 1,
  },
});

export function WistoryView(props: WistoryViewProps) {
  const wrapperStyle = useMemo(
    () => [styles.wrapperStyle, props.wrapperStyle],
    [props.wrapperStyle],
  );
  return (
    <View style={wrapperStyle}>
      <WistoryViewNativeComponent {...props} style={styles.view} />
    </View>
  );
}
