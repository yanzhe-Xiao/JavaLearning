package com.xyz.Object.movie;

public class Main {
    static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setName("复仇者联盟4");
        movie.setPrice(100.0);
        System.out.println(movie);

        MovieService movieService = new MovieService();
        movieService.addMovie(movie);
        Movie movie1 = movieService.getMovieById(1);
        System.out.println(movie1);
    }
}
