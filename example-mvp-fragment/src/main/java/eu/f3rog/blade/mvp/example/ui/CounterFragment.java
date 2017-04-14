package eu.f3rog.blade.mvp.example.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import blade.Blade;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import eu.f3rog.blade.mvp.example.R;
import eu.f3rog.blade.mvp.example.di.Components;
import eu.f3rog.blade.mvp.example.presenter.CounterPresenter;
import eu.f3rog.blade.mvp.example.view.ICounterView;


@Blade
public final class CounterFragment
        extends Fragment
        implements ICounterView {

    @Inject
    CounterPresenter mPresenter;

    @BindView(R.id.txt_number)
    TextView mText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_counter, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        Components.getAppComponent().inject(this);
    }

    @OnClick(R.id.btn_add)
    void onAddClick() {
        mPresenter.onAddClick();
    }

    @OnClick(R.id.btn_sub)
    void onSubtractClick() {
        mPresenter.onSubtractClick();
    }

    @Override
    public void show(final int number) {
        mText.setText(String.valueOf(number));
    }
}
