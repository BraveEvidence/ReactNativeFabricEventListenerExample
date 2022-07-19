package com.myappfabriceg.newarchitecture.components;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Map;

public class MyButtonViewManager extends SimpleViewManager<MyButtonView> {

    public static final String NAME = "MyButtonView";
    ReactApplicationContext mCallerContext;

    public MyButtonViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    @NonNull
    @Override
    protected MyButtonView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new MyButtonView(reactContext);
    }

    @ReactProp(name = "text")
    public void setQrCodeText(MyButtonView view, String text) {
        view.setText(text);
    }

//    @Override
//    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
//        return MapBuilder.of(
//                "topChange",
//                MapBuilder.of(
//                        "phasedRegistrationNames",
//                        "onClickHandler"
//                )
//        );
//    }

//    @Nullable
//    @Override
//    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
//        return MapBuilder.of(
//                "topChange",
//                MapBuilder.of(
//                        "phasedRegistrationNames",
//                        "onClickHandler"
//                )
//        );
//    }

    @Nullable
    @Override
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
//        return MapBuilder.of("onClickHandler",
//                MapBuilder.of("registrationName", "onClickHandler")
//        );
        return MapBuilder.of("topOnClickHandler",
                MapBuilder.of("registrationName", "onClickHandler")
        );
    }

}

