package com.xyz.Object.movie;

import java.util.ArrayList;

public class MovieService {
    private final ArrayList<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null; // 如果没有找到对应的电影，返回null
    }
}
