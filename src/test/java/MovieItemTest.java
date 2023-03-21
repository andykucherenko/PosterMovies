import org.example.MovieItem;
import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieItemTest {

    MovieItem movie_1 = new MovieItem(1, 101, "Movie_1");
    MovieItem movie_2 = new MovieItem(2, 202, "Movie_2");
    MovieItem movie_3 = new MovieItem(3, 303, "Movie_3");
    MovieItem movie_4 = new MovieItem(4, 404, "Movie_4");
    MovieItem movie_5 = new MovieItem(5, 505, "Movie_5");

    MovieManager post = new MovieManager();

    @Test
    public void shouldAddMovie() {
        post.add(movie_1);
        post.add(movie_2);
        post.add(movie_3);
        post.add(movie_4);
        post.add(movie_5);

        MovieItem[] expected = {movie_1, movie_2, movie_3, movie_4, movie_5};
        MovieItem[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        post.add(movie_1);
        post.add(movie_2);
        post.add(movie_3);
        post.add(movie_4);
        post.add(movie_5);

        MovieItem[] expected = {movie_1, movie_2, movie_3, movie_4, movie_5};
        MovieItem[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        MovieManager post = new MovieManager(5);

        post.add(movie_1);
        post.add(movie_2);
        post.add(movie_3);
        post.add(movie_4);
        post.add(movie_5);

        MovieItem[] expected = {movie_5, movie_4, movie_3, movie_2, movie_1};
        MovieItem[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfIfQuantity4FromManager3() {
        MovieManager post = new MovieManager(4);

        post.add(movie_1);
        post.add(movie_2);
        post.add(movie_3);

        MovieItem[] expected = {movie_3, movie_2, movie_1};
        MovieItem[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfQuantity3FromManager4() {
        MovieManager post = new MovieManager(3);

        post.add(movie_1);
        post.add(movie_2);
        post.add(movie_3);
        post.add(movie_4);

        MovieItem[] expected = {movie_4, movie_3, movie_2};
        MovieItem[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
