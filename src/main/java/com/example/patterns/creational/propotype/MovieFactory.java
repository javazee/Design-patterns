package com.example.patterns.creational.propotype;

public class MovieFactory implements Copyable<Movie>{

    private Movie movie;

    public MovieFactory(Movie movie) {
        this.movie = movie;
    }

    public void setFilm(Movie movie) {
        this.movie = movie;
    }

    @Override
    public Movie copy() {
        return movie.copy();
    }
}
