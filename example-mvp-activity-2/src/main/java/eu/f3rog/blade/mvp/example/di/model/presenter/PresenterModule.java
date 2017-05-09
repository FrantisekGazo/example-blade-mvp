package eu.f3rog.blade.mvp.example.di.model.presenter;

import dagger.Binds;
import dagger.Module;
import eu.f3rog.blade.mvp.example.presenter.CounterPresenter;

@Module
public abstract class PresenterModule {

    @Binds
    public abstract CounterPresenter bindsCounterPresenter(CounterPresenterImpl presenter);

//    @Provides
//    public CounterPresenter provideCounterPresenter() {
//        return new CounterPresenterImpl();
//    }
}

