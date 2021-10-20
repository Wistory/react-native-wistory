package ru.vvdev.wistory.rn;

public class RNWistoryConfig {
    static RNWistoryConfig instance = new RNWistoryConfig();

    private RNWistoryConfig() {
    }

    private String companyToken = null;
    private String userToken = null;
    private String apiUrl = null;
    private String favoriteTitle = null;
    private RNWistoryModule module = null;

    void configure(String _companyToken, String _userToken, String _apiUrl, String _favoriteTitle, RNWistoryModule _module) {
        companyToken = _companyToken;
        userToken = _userToken;
        apiUrl = _apiUrl;
        favoriteTitle = _favoriteTitle;
        module = _module;
    }

    String getCompanyToken() {
        return companyToken;
    }

    String getUserToken() {
        return userToken;
    }

    String getApiUrl() {
        return apiUrl != null ? apiUrl + "api/" : null;
    }
    void onEvent(String e, String option) {
        if (module != null) {
            module.onEvent(e, option);
        }
    }
}
