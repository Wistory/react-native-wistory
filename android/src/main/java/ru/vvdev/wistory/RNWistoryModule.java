package ru.vvdev.wistory;

import android.app.Application;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;
import ru.vvdev.wistory.Wistory;

import static com.facebook.react.bridge.UiThreadUtil.runOnUiThread;

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
    public void init(final String companyToken, final String userToken) {
        runOnUiThread(new Thread(new Runnable() {
            @Override
            public void run() {
            }
        }));
    }
}
