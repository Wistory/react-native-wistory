import React, {useEffect, useMemo, useState} from 'react';
import {StyleSheet} from 'react-native';
import {WistoryViewProps} from './WistoryViewProps';
import {WistoryViewNativeComponent} from './WistoryViewNativeComponent';

export function WistoryView(props: WistoryViewProps) {
  const [height, setHeight] = useState<number | undefined>(0);
  useEffect(() => {
    const timer = setTimeout(() => setHeight(100), 1000);
    return () => clearTimeout(timer);
  }, []);
  const style = useMemo(() => StyleSheet.flatten([props.style, {height}]), [
    props.style,
    height,
  ]);
  return <WistoryViewNativeComponent {...props} style={style} />;
}
