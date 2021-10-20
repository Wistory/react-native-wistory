package ru.vvdev.wistory.rn;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.HashMap;
import java.util.Map;

public class RNWistoryModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "RNWistory";

    private ReactApplicationContext getContext() {
        return reactContext;
    }

    private static void emitDeviceEvent(String eventName, @Nullable WritableMap eventData) {
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(eventName, eventData);
    }

    private static ReactApplicationContext reactContext = null;

    RNWistoryModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
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
    public void init(final String companyToken, final String userToken, final String apiUrl, final String favoriteTitle) {
        RNWistoryConfig.instance.configure(companyToken, userToken, apiUrl, favoriteTitle, this);
    }

    public void onEvent(String event, String option) {
        WritableMap json = Arguments.createMap();
        json.putString("action", event);
        json.putString("value", option);
        emitDeviceEvent("onEvent", json);
    }
}
