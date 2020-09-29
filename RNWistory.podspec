require "json"

Pod::Spec.new do |s|
    package = JSON.parse(File.read(File.join(File.dirname(__FILE__), "package.json")))
    s.name         = "RNWistory"
    s.version      = package["version"]
    s.summary      = package["description"]
    s.homepage     = "vvdev.ru"
    s.license      = "CC BY 4.0"
    s.author       = { package["author"]["name"] => package["author"]["email"] }
    s.platform     = :ios, "11.0"
    s.source       = { :git => "https://github.com/Wistory/react-native-wistory", :tag => "master" }
    s.source_files = "ios/**/*.{h,m,swift}"

    s.dependency "React"
    s.dependency "Wistory"
end
