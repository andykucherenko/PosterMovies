package org.example;

public class MovieManager {

    private MovieItem[] movies = new MovieItem[0];
    private int quantity;

    public MovieManager() {
        this.quantity = 5;
    }

    public MovieManager(int quantity) {
        this.quantity = quantity;
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (movies.length < quantity) {
            resultLength = movies.length;
        } else {
            resultLength = quantity;
        }
        MovieItem[] tmp = new MovieItem[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}