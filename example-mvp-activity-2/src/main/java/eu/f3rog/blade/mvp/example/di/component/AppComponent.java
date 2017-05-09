package eu.f3rog.blade.mvp.example.di.component;

import dagger.Component;
import eu.f3rog.blade.mvp.example.di.model.presenter.PresenterModule;
import eu.f3rog.blade.mvp.example.ui.CounterActivity;
import eu.f3rog.blade.mvp.example.di.model.AppModule;


@Component(modules = {
        AppModule.class,
        PresenterModule.class
})
public interface AppComponent {

    void inject(CounterActivity activity);
}
