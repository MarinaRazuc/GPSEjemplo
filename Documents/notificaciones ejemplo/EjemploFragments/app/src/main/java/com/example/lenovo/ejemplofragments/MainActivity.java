package com.example.lenovo.ejemplofragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.lenovo.ejemplofragments.R;

public class MainActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_articles);
    }
}