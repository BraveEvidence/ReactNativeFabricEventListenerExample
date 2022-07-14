package com.myappfabriceg.newarchitecture.components;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;

public class MyButtonView extends androidx.appcompat.widget.AppCompatButton {

    public MyButtonView(Context context) {
        super(context);
        configureViews();
    }

    private void configureViews(){
        setBackgroundColor(Color.YELLOW);
        setOnClickListener(view -> {
            onReceiveNativeEvent();
        });
    }

    public void onReceiveNativeEvent() {
        WritableMap event = Arguments.createMap();
        event.putString("message", "MyMessage");
        ReactContext reactContext = (ReactContext)getContext();
        reactContext.getJSModule(RCTModernEventEmitter.class)
                .receiveEvent(getId(),getId(),"topChange",true,0,event,1);

    }
}
//Not sure what to pass targetTag, canCoalesceEvent, customCoalesceKey and category in receiveEvent
