# Installation 

- Install dependency
 
`yarn add https://github.com/Wistory/react-native-wistory`

## iOS

**Note**: XCode 12.5 is required to use sdk.

- Target iOS 11. Update in Podfile (`platform :ios, '11.0'`) and XCode (General -> Deployment Info -> Target)

- Insert into `Podfile`:

```
source 'https://github.com/Wistory/Specs.git'
source 'https://github.com/CocoaPods/Specs.git'

...

  pod 'Wistory', '~> 0.5.22'

```

- Run `pod install`

**Note**: after update native Wistory sdk in Podfile use `pod install --repo-update`

- Set Build settings -> Build options -> Enable bitcode to `No` in XCode project

## Android

- `minSdkVersion` for android - 21. Update `android/build.gradle`

- add `maven { url 'https://www.jitpack.io' }` in `android/build.gradle`
```
allprojects {
    repositories {
        maven {
          url 'https://www.jitpack.io'
        }
```

- update `MainApplication.java`:

```
import ru.vvdev.wistory.rn.WistoryInitializer; // <----

public class MainApplication extends Application implements ReactApplication {
...

  @Override
  public void onCreate() {
    super.onCreate();
    WistoryInitializer.initialize(this); // <-----
    SoLoader.init(this, /* native exopackage */ false);
    initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
  }
}
```

- config sdk in `AndroidManifest.xml`. Insert meta-data inside application tag:

```
<meta-data
        android:name="WISTORY_TOKEN"
        android:value="YOUR_COMPANY_TOKEN" />
```

- _(optional)_ Specify meta-data to change wistory server url

```
<meta-data
        android:name="WISTORY_SERVER_URL"
        android:value="YOUR_SERVER_URL" />
```

# Usage

- import dependency

`import {WistoryView, Wistory} from 'react-native-wistory'`
- configure ios sdk:
```
Wistory.init('COMPANY_TOKEN');
```
This function do nothing for android.

- render WistoryView:
```
function App() {
  return (
    <View style={{flex: 1}}>
      <WistoryView />
    </View
  )
}
```

# TODO

- [ ] change base url for ios
- [ ] wrap android listener methods
- [ ] customize android sdk params from javascript
- [ ] wrap ios delegate methods
- [ ] publish npm package

# Licence
Shield: [![CC BY 4.0][cc-by-shield]][cc-by]

This work is licensed under a
[Creative Commons Attribution 4.0 International License][cc-by].

[![CC BY 4.0][cc-by-image]][cc-by]

[cc-by]: http://creativecommons.org/licenses/by/4.0/
[cc-by-image]: https://i.creativecommons.org/l/by/4.0/88x31.png
[cc-by-shield]: https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg
