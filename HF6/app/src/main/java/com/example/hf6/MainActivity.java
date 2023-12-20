package com.example.hf6;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView2, new Fragment1())
                    .replace(R.id.fragmentContainerView3, new Fragment2())
                    .commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new Fragment1())
                    .commit();
        }
    }
}
