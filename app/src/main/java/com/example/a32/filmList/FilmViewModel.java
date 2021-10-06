package com.example.a32.filmList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.a32.data.models.Film;
import com.example.a32.data.repositories.GhibliRepository;
import com.example.a32.ui.App;


import java.util.List;

public class FilmViewModel extends ViewModel {

    private final GhibliRepository repository = new GhibliRepository();
    MutableLiveData<List<Film>> getFilms(){
        return repository.getFilms();
    }

//    public LiveData<List<Film>> films;
//    void getFilms(){
//        films =  App.repository.getFilms();
//    }
}