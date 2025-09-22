package org.example.ATJAVA.movies.service;

import org.example.ATJAVA.movies.data.MovieRepository;
import org.example.ATJAVA.movies.model.Genre;
import org.example.ATJAVA.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MovieServiceTest {

    private MovieService movieService;

    @Before
    public void setUp() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION, "Christopher Nolan"),
                        new Movie(2, "Memento", 113, Genre.THRILLER, "Christopher Nolan"),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY, "Peter Farrelly"),
                        new Movie(4, "Super 8", 112, Genre.THRILLER, "J.J. Abrams"),
                        new Movie(5, "Scream", 111, Genre.HORROR, "Wes Craven"),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY, "Chris Columbus"),
                        new Movie(7, "Matrix", 136, Genre.ACTION, "The Wachowskis")
                )
        );


        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(3, 6)));
    }
    @Test
    public void return_movies_by_duration() {

        Collection<Movie> movies = movieService.findMoviesByDuration(120);

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(2, 3, 4, 5, 6)));
    }
    @Test
    public void return_movies_by_name() {
        Collection<Movie> movies = movieService.findByName("Dark Knight");

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(1)));
    }
    @Test
    public void return_movies_by_director() {
        Collection<Movie> movies = movieService.findByDirector("Christopher Nolan");

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(1, 2)));
    }
    @Test
    public void return_movies_by_template() {

        Collection<Movie> movies = movieService.findMoviesByTemplate(new Movie(null, 112, Genre.THRILLER, null));
        Collection<Movie> movies1 = movieService.findMoviesByTemplate(new Movie("Matrix", 0, null, null)); // Duration 0 means no preference
        Collection<Movie> movies2 = movieService.findMoviesByTemplate(new Movie(null, 0, null, null));
        Collection<Movie> movies3 = movieService.findMoviesByTemplate(new Movie(null, 0, null, "Christopher Nolan"));

        assertThat(getMovieIds(movies), CoreMatchers.is(Arrays.asList(4)));
        assertThat(getMovieIds(movies1), CoreMatchers.is(Arrays.asList(7)));
        assertThat(getMovieIds(movies2), CoreMatchers.is(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
        assertThat(getMovieIds(movies3), CoreMatchers.is(Arrays.asList(1, 2)));
    }

    private static List<Integer> getMovieIds(Collection<Movie> movies) {
        return movies.stream().map(Movie::getId).toList();
    }
}