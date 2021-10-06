package com.example.a32.filmList;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a32.R;
import com.example.a32.data.models.Film;
import com.example.a32.databinding.FragmentFilmBinding;

import java.util.List;


public class FilmFragment extends Fragment {

    private FragmentFilmBinding fragmentFilmBinding;
    private FilmAdapter filmAdapter;
    private FilmViewModel filmViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        filmAdapter  = new FilmAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentFilmBinding = FragmentFilmBinding.inflate(inflater,container,false);
        return fragmentFilmBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        filmViewModel = new ViewModelProvider(requireActivity()).get(FilmViewModel.class);
        setRv();
    }

    private void setRv() {
        fragmentFilmBinding.filmRv.setAdapter(filmAdapter);
        filmViewModel.getFilms().observe(getViewLifecycleOwner(), new Observer<List<Film>>() {
            @Override
            public void onChanged(List<Film> films) {
                filmAdapter.setFilms(films);
            }
        });
    }


}
