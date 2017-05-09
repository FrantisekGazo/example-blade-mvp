package eu.f3rog.blade.mvp.example.di.model.presenter;


import android.support.annotation.NonNull;

import javax.inject.Inject;

import blade.State;
import eu.f3rog.blade.mvp.example.presenter.CounterPresenter;
import eu.f3rog.blade.mvp.example.view.ICounterView;


final class CounterPresenterImpl
        extends CounterPresenter {

    @State
    int mNumber;

    @Inject
    public CounterPresenterImpl() {
        mNumber = 0;
    }

    @Override
    public void onBind(@NonNull
                       final ICounterView view) {
        super.onBind(view);

        show();
    }

    @Override
    public void onAddClick() {
        mNumber++;
        show();
    }

    @Override
    public void onSubtractClick() {
        mNumber--;
        show();
    }

    private void show() {
        if (getView() != null) {
            getView().show(mNumber);
        }
    }
}
