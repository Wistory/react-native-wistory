package ru.vvdev.wistory.rn;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

import javax.annotation.Nonnull;

import ru.vvdev.wistory.UiConfig;
import ru.vvdev.wistory.WistoryView;
import ru.vvdev.wistory.internal.presentation.callback.StoryEventListener;

public class WistoryViewManager extends SimpleViewManager<WistoryView> implements StoryEventListener {
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
        view.setEventListener(this);
        return view;
    }

    @Override
    public void onError(@NotNull Exception e) {

    }

    @Override
    public void onFavorite(@NotNull String s, boolean b) {

    }

    @Override
    public void onItemsLoaded() {

    }

    @Override
    public void onNavigate(@NotNull String event, @NotNull String option) {
        RNWistoryConfig.instance.onEvent(event, option);
    }

    @Override
    public void onNextSnap(@NotNull String s) {

    }

    @Override
    public void onPoll(@NotNull String s, int i, @Nullable String s1, @Nullable String s2) {

    }

    @Override
    public void onPreviousSnap(@NotNull String s) {

    }

    @Override
    public void onRead(@NotNull String s) {

    }

    @Override
    public void onRelation(@NotNull String s, @NotNull String s1) {

    }
}
