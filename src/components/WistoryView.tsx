import React from 'react';
import {WistoryViewProps} from './WistoryViewProps';
import {WistoryViewNativeComponent} from './WistoryViewNativeComponent';

export function WistoryView(props: WistoryViewProps) {
  return <WistoryViewNativeComponent {...props} />;
}
