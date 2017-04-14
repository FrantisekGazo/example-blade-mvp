package eu.f3rog.blade.mvp.example.ui;

import android.app.Application;

import eu.f3rog.blade.mvp.example.di.Components;


public final class App
        extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Components.initAppComponent(this);
    }
}
