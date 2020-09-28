package ru.vvdev.wistory;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

import java.util.Map;

import javax.annotation.Nonnull;

import ru.vvdev.wistory.view.WistoryView;

public class WistoryViewManager extends ViewGroupManager<WistoryView> {
    public static final String REACT_CLASS = "WistoryView";

    WistoryViewManager() {
    }

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
        WistoryView view = new WistoryView(context);
        return view;
    }
}
