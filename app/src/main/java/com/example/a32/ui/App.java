package com.example.a32.ui;

import android.app.Application;

import com.example.a32.data.remote.GhibliApi;
import com.example.a32.data.remote.RetrofitClient;
import com.example.a32.data.repositories.GhibliRepository;

public class App extends Application {

    public static GhibliApi api;
    public static GhibliRepository repository;

    @Override
    public void onCreate() {
        super.onCreate();
        api = new RetrofitClient().provideGhibliApi();
        repository = new GhibliRepository();
    }
}
