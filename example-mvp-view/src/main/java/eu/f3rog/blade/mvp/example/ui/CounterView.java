package eu.f3rog.blade.mvp.example.ui;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import eu.f3rog.blade.mvp.example.R;
import eu.f3rog.blade.mvp.example.di.Components;
import eu.f3rog.blade.mvp.example.presenter.CounterPresenter;
import eu.f3rog.blade.mvp.example.view.ICounterView;


public final class CounterView
        extends LinearLayout
        implements ICounterView {

    @Inject
    CounterPresenter mPresenter;

    @BindView(R.id.txt_number)
    TextView mText;

    public CounterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CounterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CounterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
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
