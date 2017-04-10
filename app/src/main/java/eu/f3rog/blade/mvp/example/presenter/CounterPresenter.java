package eu.f3rog.blade.mvp.example.presenter;


import android.support.annotation.NonNull;

import javax.inject.Inject;

import blade.mvp.BasePresenter;
import eu.f3rog.blade.mvp.example.view.IMainView;


public final class CounterPresenter
        extends BasePresenter<IMainView> {

    private int mNumber;

    @Inject
    public CounterPresenter() {
        mNumber = 0;
    }

    @Override
    public void onBind(@NonNull final IMainView view) {
        super.onBind(view);

        show();
    }

    public void onAddClick() {
        mNumber++;
        show();
    }

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