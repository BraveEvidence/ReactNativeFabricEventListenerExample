//package com.myappfabriceg.newarchitecture.components
//
//import com.facebook.react.bridge.ReactApplicationContext
//import com.facebook.react.common.MapBuilder
//import com.facebook.react.uimanager.SimpleViewManager
//import com.myappfabriceg.newarchitecture.components.MyButtonView
////import com.myappfabriceg.newarchitecture.components.MyButtonViewManager
//import com.facebook.react.uimanager.ThemedReactContext
//import com.facebook.react.uimanager.annotations.ReactProp
//
//
//
//
//class MyButtonViewManager123(var mCallerContext: ReactApplicationContext) :
//    SimpleViewManager<MyButtonView?>() {
//    override fun getName(): String {
//        return NAME
//    }
//
//    override fun createViewInstance(reactContext: ThemedReactContext): MyButtonView {
//        return MyButtonView(reactContext)
//    }
//
//    @ReactProp(name = "text")
//    fun setQrCodeText(view: MyButtonView, text: String?) {
//        view.text = text
//    }
//
//    override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any>? {
//        return MapBuilder.of(
//            "topChange",
//            MapBuilder.of("registrationName","onClickHandler")
//        )
//    }
//
//    //    @Override
//    //    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
//    //        return MapBuilder.builder().put(
//    //                "topChange",
//    //                MapBuilder.of("registrationName","onClickHandler")
//    //        ).build();
//    //    }
//    //        public Map getExportedCustomBubblingEventTypeConstants() {
//    //        return MapBuilder.builder().put(
//    //                "topChange",
//    //                MapBuilder.of(
//    //                        "registrationName","onClickHandler"
//    ////                        MapBuilder.of("bubbled", "onClickHandler")
//    //                )
//    //        ).build();
//    //    }
//    companion object {
//        const val NAME = "MyButtonView"
//    }
//}