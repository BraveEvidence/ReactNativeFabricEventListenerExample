package com.myappfabriceg.newarchitecture.components;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
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
            Log.i("here55","123");
            onReceiveNativeEvent();
        });
    }

    public void onReceiveNativeEvent() {
        Log.i("here55","678");
        WritableMap event = Arguments.createMap();
        Log.i("here55","1111");
        event.putString("message", "MyMessage");
        Log.i("here55","2222");
        ReactContext reactContext = (ReactContext)getContext();
        Log.i("here55","3333");
        reactContext.getJSModule(RCTEventEmitter.class)
                .receiveEvent(getId(),"onClickHandler",null);
        Log.i("here55","4444");
//        reactContext.getJSModule(RCTEventEmitter.class)
//                .receiveEvent(getId(),"topChange",event);
//        reactContext.getJSModule(RCTModernEventEmitter.class)
//                .receiveEvent(getId(),getId(),"topChange",true,0,event,1);

    }
}























