package ru.vvdev.wistory.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import ru.vvdev.wistory.R;
import ru.vvdev.wistory.WistoryView;

public class RNWistoryView extends FrameLayout {
    public RNWistoryView(Context context) {
        super(context);
       LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       inflater.inflate(R.layout.rnwistoryview, this, true);
    }
}
