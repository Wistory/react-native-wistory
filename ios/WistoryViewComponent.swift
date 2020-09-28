//
import Foundation
import Wistory

@objc class WistoryViewComponent: UIView {
    let wistory = Wistory(with: RNWistoryConfig.sharedInstance()?.companyToken ?? "", userToken: RNWistoryConfig.sharedInstance()?.userToken, usageSettings: .embedded)
  .presentingSettings(style: .popover)
    .storiesViewController;

  override init(frame: CGRect) {
    super.init(frame: frame)

    wistory.view.translatesAutoresizingMaskIntoConstraints = false
    addSubview(wistory.view)

    NSLayoutConstraint.activate([
        wistory.view.leadingAnchor.constraint(equalTo: leadingAnchor),
        wistory.view.trailingAnchor.constraint(equalTo: trailingAnchor),
        wistory.view.topAnchor.constraint(equalTo: topAnchor),
        wistory.view.bottomAnchor.constraint(equalTo: bottomAnchor),
        wistory.view.heightAnchor.constraint(equalToConstant: 118)
    ])

    let controller = RNWistoryConfig.sharedInstance()?.reactViewController
    wistory.didMove(toParent: controller)
  }


  required init?(coder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }
}
