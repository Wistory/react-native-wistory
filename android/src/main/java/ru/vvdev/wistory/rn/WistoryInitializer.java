package ru.vvdev.wistory.rn;

import android.app.Application;

import ru.vvdev.wistory.Wistory;

public class WistoryInitializer {
    public static void initialize(Application application) {
        Wistory.INSTANCE.initialize(application);
    }
}
