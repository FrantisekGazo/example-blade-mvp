package eu.f3rog.blade.mvp.example.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import blade.Blade;
import eu.f3rog.blade.mvp.example.R;


@Blade // <-- Activity that contains a View with Presenter must be annotated with @Blade
public final class CounterActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
    }
}
