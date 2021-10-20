import React, {useEffect, useMemo} from 'react';
import {StyleSheet, View, NativeEventEmitter, NativeModules} from 'react-native';
import {WistoryViewProps} from './WistoryViewProps';
import {WistoryViewNativeComponent} from './WistoryViewNativeComponent';

const { RNWistory } = NativeModules;
const emitter = new NativeEventEmitter(RNWistory);

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
  useEffect(() => {
    const subscription = emitter.addListener('onEvent', props.onEvent);
    return subscription.remove;
  }, [props.onEvent]);
  return (
    <View style={wrapperStyle}>
      <WistoryViewNativeComponent {...props} style={styles.view} />
    </View>
  );
}
