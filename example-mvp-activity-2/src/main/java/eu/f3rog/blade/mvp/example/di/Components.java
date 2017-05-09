package eu.f3rog.blade.mvp.example.di;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import eu.f3rog.blade.mvp.example.ui.App;
import eu.f3rog.blade.mvp.example.di.component.AppComponent;
import eu.f3rog.blade.mvp.example.di.component.DaggerAppComponent;
import eu.f3rog.blade.mvp.example.di.model.AppModule;

public final class Components {

    @Nullable
    private static AppComponent sAppComponent;

    public static void initAppComponent(@NonNull final App app) {
        sAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(app))
                .build();
    }

    @NonNull
    public static AppComponent getAppComponent() {
        if (null == sAppComponent) {
            throw new IllegalStateException("You forgot to call initAppComponent()");
        }
        return sAppComponent;
    }

    private Components() {
        throw new IllegalStateException("This class cannot be instantiated");
    }
}
