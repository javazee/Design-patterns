package com.example.patterns.creational.propotype;

public class Movie {

    private String title;
    private String author;
    private String plot;

    public Movie(String title, String author, String plot) {
        this.title = title;
        this.author = author;
        this.plot = plot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", plot='" + plot + '\'' +
                '}';
    }

    public Movie copy() {
        return new Movie(title, author, plot);
    }
}
