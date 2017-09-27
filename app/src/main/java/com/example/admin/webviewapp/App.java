package com.example.admin.webviewapp;

import android.app.Application;

import com.example.admin.webviewapp.model.MyObjectBox;

import io.objectbox.BoxStore;

/**
 * Created by Admin on 9/25/2017.
 */

public class App extends Application {

    private static App sApp;
    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();

        sApp = this;
        boxStore = MyObjectBox.builder().androidContext(App.this).build();
    }

    public static App getsApp(){
        return sApp;
    }

    public BoxStore getBoxStore(){
        return boxStore;
    }
}
