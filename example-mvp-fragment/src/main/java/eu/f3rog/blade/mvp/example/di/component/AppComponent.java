package eu.f3rog.blade.mvp.example.di.component;

import dagger.Component;
import eu.f3rog.blade.mvp.example.di.model.AppModule;
import eu.f3rog.blade.mvp.example.ui.CounterFragment;


@Component(modules = {
        AppModule.class
})
public interface AppComponent {

    void inject(CounterFragment fragment);
}
