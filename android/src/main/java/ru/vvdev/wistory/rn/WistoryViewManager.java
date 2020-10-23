package ru.vvdev.wistory.rn;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

import javax.annotation.Nonnull;

import ru.vvdev.wistory.UiConfig;
import ru.vvdev.wistory.WistoryView;

public class WistoryViewManager extends SimpleViewManager<WistoryView> {
    public static final String REACT_CLASS = "WistoryView";

    WistoryViewManager() {
    }

    @NotNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.<String, Object>builder()
                .build();
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().build();
    }

    @Nonnull
    @Override
    public WistoryView createViewInstance(@Nonnull ThemedReactContext context) {
        WistoryView view = new WistoryView(context.getCurrentActivity());
        UiConfig config = new UiConfig();
        config.setFormat(UiConfig.Format.FULLSCREEN);
        view.setConfig(config);
        return view;
    }
}
