package org.example.ATJAVA.movies.data;

import org.example.ATJAVA.movies.model.Genre;
import org.example.ATJAVA.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MovieRepositoryJdbcTest {

    MovieRepositoryJdbc movieRepository;
    DataSource dataSource;

    @Before
    public void setUp() throws Exception {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);

    }

    @Test
    public void load_all_movies() throws SQLException {

        Collection<Movie> movies = movieRepository.findAll();

        assertThat(movies, equalTo(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION, "Christopher Nolan"),
                new Movie(2, "Memento", 113, Genre.THRILLER, "Christopher Nolan"),
                new Movie(3, "Matrix", 136, Genre.ACTION, "Wachowski Brothers")
        )));
    }
    @Test
    public void load_movie_by_id() {

        Movie movie = movieRepository.findById(2);

        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER, "Unknown")));
    }

    @Test
    public void insert_movie() {

        Movie movie = new Movie("Super 8", 112, Genre.THRILLER, "J.J. Abrams");

        movieRepository.saveOrUpdate(movie);

        Movie movieFromDB = movieRepository.findById(4);

        assertThat(movieFromDB, equalTo(new Movie(4, "Super 8", 112, Genre.THRILLER, "J.J. Abrams")));
    }

    @After
    public void tearDown() throws Exception {

        // Remove H2 files -- https://stackoverflow.com/a/51809831/1121497
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("DROP ALL OBJECTS DELETE FILES"); // "shutdown" also works
    }
}