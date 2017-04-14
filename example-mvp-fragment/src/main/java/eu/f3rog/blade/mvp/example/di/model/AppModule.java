package eu.f3rog.blade.mvp.example.di.model;

import android.content.Context;
import android.support.annotation.NonNull;

import dagger.Module;
import dagger.Provides;
import eu.f3rog.blade.mvp.example.ui.App;


@Module
public final class AppModule {

    @NonNull
    private final App mApp;

    public AppModule(@NonNull final App app) {
        mApp = app;
    }

    @Provides
    public Context provideApplicationContext() {
        return mApp;
    }
}
