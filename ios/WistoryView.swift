//
//  WistoryView.swift
//  globus
//
//  Created by Nikita Sirotkin on 18.09.2020.
//  Copyright © 2020 Facebook. All rights reserved.
//
import Foundation
import Wistory

@objc(WistoryView)
class WistoryView: RCTViewManager {
  override func view() -> UIView! {
    return WistoryViewComponent()
  }
  
  override class func requiresMainQueueSetup() -> Bool {
    return true
  }
}
