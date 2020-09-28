# Installation

- Install dependency
 
`yarn add https://github.com/volga-volga/react-native-wistory`

- Insert into `Podfile`:

```
source 'https://github.com/Wistory/Specs.git'
source 'https://github.com/CocoaPods/Specs.git'

...

  use_frameworks!

  pod 'Wistory', '~> 0.3.0'

```

- Run `pod install`

# TODO

- [ ] wrap android sdk
- [ ] wrap ios delegate methods

# Licence
Shield: [![CC BY 4.0][cc-by-shield]][cc-by]

This work is licensed under a
[Creative Commons Attribution 4.0 International License][cc-by].

[![CC BY 4.0][cc-by-image]][cc-by]

[cc-by]: http://creativecommons.org/licenses/by/4.0/
[cc-by-image]: https://i.creativecommons.org/l/by/4.0/88x31.png
[cc-by-shield]: https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg
