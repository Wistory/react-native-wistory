package ru.vvdev.wistory.rn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class RNWistoryModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "RNWistory";

    private ReactApplicationContext getContext() {
        return reactContext;
    }

    private static ReactApplicationContext reactContext = null;

    RNWistoryModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public Map<String, Object> getConstants() {
        return new HashMap<>();
    }

    @ReactMethod
    public void init(final String companyToken, final String userToken, final String apiUrl) {
        RNWistoryConfig.instance.configure(companyToken, userToken, apiUrl);
    }
}
