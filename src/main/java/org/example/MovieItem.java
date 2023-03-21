package org.example;

public class MovieItem {

    private int id;
    private int movieId;
    private String title;

    public MovieItem(int id, int movieId, String title) {
        this.id = id;
        this.movieId = movieId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return title;
    }

    public void setMovieTitle(String title) {
        this.title = title;
    }
}