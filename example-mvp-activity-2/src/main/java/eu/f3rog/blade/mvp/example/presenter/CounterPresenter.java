package eu.f3rog.blade.mvp.example.presenter;


import blade.mvp.BasePresenter;
import eu.f3rog.blade.mvp.example.view.ICounterView;

public abstract class CounterPresenter
        extends BasePresenter<ICounterView> {

    public abstract void onAddClick();

    public abstract void onSubtractClick();
}
