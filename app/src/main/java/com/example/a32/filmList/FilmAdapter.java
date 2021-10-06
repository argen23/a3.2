package com.example.a32.filmList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a32.data.models.Film;
import com.example.a32.databinding.ItemFilmsBinding;

import java.util.ArrayList;
import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {
    private List<Film> films = new ArrayList<>();

    public void setFilms(List<Film> films) {
        this.films = films;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemFilmsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(films.get(position));
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemFilmsBinding binding;
        public ViewHolder(@NonNull ItemFilmsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Film film) {
            binding.tvTitle.setText(film.getTitle());
            binding.tvDirector.setText(film.getDirector());
        }
    }
}
