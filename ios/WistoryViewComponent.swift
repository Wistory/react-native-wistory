//
import Foundation
import Wistory

@objc class WistoryViewComponent: UIView, RootViewDelegate {
    let wistory = Wistory(
        with: RNWistoryConfig.sharedInstance()?.companyToken ?? "",
        registrationId: RNWistoryConfig.sharedInstance()?.userToken,
        usageSettings: .embedded,
        displayTitle: false
    )
        .favouriteString(RNWistoryConfig.sharedInstance()?.favoriteString ?? "Избранное")
        .presentingSettings(style: .fullscreen)
        .storiesViewController

    override init(frame: CGRect) {
        super.init(frame: frame)
        if let wistoryController = wistory {
            wistoryController.delegate = self
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


    func onItemsLoaded() {

    }

    func onRead(story: SnapModel) {

    }

    func onPrevSnap(story: SnapModel) {

    }

    func onNextSnap(story: SnapModel) {

    }

    func onNavigate(action: String?, value: String) {
        wistory?.dismiss(animated: true) {
            let wistoryModule = RNWistoryConfig.sharedInstance()?.wistory
            if (wistoryModule != nil) {
                wistoryModule?.onEvent(action, withValue: value)
            }
        }
    }

    func onFavorite(id: String, isFavorite: Bool) {

    }

    func onRelation(id: String, relation: String) {

    }

    func onPoll(id: String, snap: Int, option: String) {

    }

    func onError(error: Error) {

    }
}

