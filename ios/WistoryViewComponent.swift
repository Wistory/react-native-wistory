//
import Foundation
import Wistory

@objc class WistoryViewComponent: UIView {
    let wistory = Wistory(
        with: RNWistoryConfig.sharedInstance()?.companyToken ?? "",
        registrationId: RNWistoryConfig.sharedInstance()?.userToken,
        usageSettings: .embedded
    )
    .presentingSettings(style: .popover)
    .storiesViewController;

    override init(frame: CGRect) {
        super.init(frame: frame)
        if let wistoryController = wistory {


            wistoryController.view.translatesAutoresizingMaskIntoConstraints = false
            addSubview(wistoryController.view)

            NSLayoutConstraint.activate([
                wistoryController.view.leadingAnchor.constraint(equalTo: leadingAnchor),
                wistoryController.view.trailingAnchor.constraint(equalTo: trailingAnchor),
                wistoryController.view.topAnchor.constraint(equalTo: topAnchor),
                wistoryController.view.bottomAnchor.constraint(equalTo: bottomAnchor),
                wistoryController.view.heightAnchor.constraint(equalToConstant: 118)
            ])

            let controller = RNWistoryConfig.sharedInstance()?.reactViewController
            wistoryController.didMove(toParent: controller)
        }
    }


    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
}
