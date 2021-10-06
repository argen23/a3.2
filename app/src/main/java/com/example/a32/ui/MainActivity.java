package com.example.a32.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a32.R;
import com.example.a32.filmList.FilmViewModel;

public class MainActivity extends AppCompatActivity {
    private FilmViewModel filmViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmViewModel = new FilmViewModel();
    }
}