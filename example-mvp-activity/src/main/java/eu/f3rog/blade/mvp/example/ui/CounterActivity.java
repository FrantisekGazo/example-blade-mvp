package eu.f3rog.blade.mvp.example.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import eu.f3rog.blade.mvp.example.R;
import eu.f3rog.blade.mvp.example.di.Components;
import eu.f3rog.blade.mvp.example.presenter.CounterPresenter;
import eu.f3rog.blade.mvp.example.view.ICounterView;


public final class CounterActivity
        extends AppCompatActivity
        implements ICounterView {

    @Inject
    CounterPresenter mPresenter;

    @BindView(R.id.txt_number)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        ButterKnife.bind(this);

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
