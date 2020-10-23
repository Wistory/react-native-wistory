package ru.vvdev.wistory.rn;

public class RNWistoryConfig {
    static RNWistoryConfig instance = new RNWistoryConfig();

    private RNWistoryConfig() {
    }

    private String companyToken = null;
    private String userToken = null;
    private String apiUrl = null;

    void configure(String _companyToken, String _userToken, String _apiUrl) {
        companyToken = _companyToken;
        userToken = _userToken;
        apiUrl = _apiUrl;
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
}
