package com.example.a32.data.remote;

import com.example.a32.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GhibliApi {

    @GET("/films")
    Call<List<Film>> getFilms();
}
