package eu.f3rog.blade.mvp.example.view;


import blade.mvp.IView;


public interface ICounterView
        extends IView {

    void show(final int number);
}
