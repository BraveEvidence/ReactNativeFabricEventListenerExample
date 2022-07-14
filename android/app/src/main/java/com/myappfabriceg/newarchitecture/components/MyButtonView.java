package com.myappfabriceg.newarchitecture.components;

import android.content.Context;
import android.graphics.Color;

public class MyButtonView extends androidx.appcompat.widget.AppCompatButton {

    public MyButtonView(Context context) {
        super(context);
        configureViews();
    }

    private void configureViews(){
        setBackgroundColor(Color.YELLOW);
    }
}
