package ua.hillel.javaElementary.hw19.movieLibrary.engine;


import ua.hillel.javaElementary.hw19.movieLibrary.entity.Actor;
import ua.hillel.javaElementary.hw19.movieLibrary.entity.Director;
import ua.hillel.javaElementary.hw19.movieLibrary.entity.Movie;
import ua.hillel.javaElementary.hw19.movieLibrary.enums.QueryDB;
import ua.hillel.javaElementary.hw19.movieLibrary.source.HomeMovieDBBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {

    private HomeMovieDBBD myMovies;

    public MovieLibrary() throws SQLException {
        myMovies = new HomeMovieDBBD();
    }

    public List<Actor> findActorsFromMovie(String movieName) {
        List<Actor> actorList = new ArrayList<>();
        try (ResultSet result = myMovies.getDataByName(QueryDB.ACTORS_FROM_FILM.getDbQuery(), movieName)) {
            actorList = makeActorList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;
    }

    public List<Movie> findMoviesByAge(int age) {

        List<Movie> movieList = new ArrayList<>();

        try (ResultSet result = myMovies.getDataByDate(QueryDB.MOVIES_BY_PRODUCTION_YEAR.getDbQuery(), getDate(age))) {
            movieList = makeMovieList(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movieList;
    }

    public List<Actor> findActorsInManyMovies(int movieCount) {
        List<Actor> actorList = new ArrayList<>();
        try (ResultSet result = myMovies.getDataByMovieQuantity(QueryDB.ACTORS_FROM_N_FILM.getDbQuery(), movieCount)) {
            actorList = makeActorList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;
    }

    public List<Actor> findActorsAsDirectors() {
        List<Actor> actorList = new ArrayList<>();
        try (ResultSet result = myMovies.getDataDirector(QueryDB.ACTORS_AS_DIRECTORS.getDbQuery())) {
            actorList = makeActorList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;

    }

    public int removeMoviesOlderThanGivenYears(int years) {
        int removedMovies = 0;

        try {
            removedMovies = myMovies.removeMoviesOlderThenGivenDate(QueryDB.REMOVE_MOVIES_BY_GIVEN_YEAR.getDbQuery(), getDate(years));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return removedMovies;
    }

    public void close() throws SQLException {
        myMovies.close();
    }

    private LocalDate getDate(int year) {
        LocalDate currentDate = LocalDate.now();
        LocalDate previousDate = LocalDate.of(currentDate.getYear() - year, Month.JANUARY, 1);
        return previousDate;
    }

    private List<Actor> makeActorList(ResultSet result) throws SQLException {
        List<Actor> actorList = new ArrayList<>();


        while (result.next()) {

            actorList.add(new Actor(result.getInt("actor_id"), result.getString("actor_name"), result.getDate("actor_birthday")));

        }
        return actorList;
    }

    private List<Actor> makeActorList(ResultSet result, int movieID, Actor firstActor) throws SQLException {
        List<Actor> actorList = new ArrayList<>();
        actorList.add(firstActor);


        while (result.next() && result.getInt("movie_id") == movieID) {

            actorList.add(new Actor(result.getInt("actor_id"), result.getString("actor_name"), result.getDate("actor_birthday")));

        }
        return actorList;
    }

    private List<Movie> makeMovieList(ResultSet result) throws SQLException {
        List<Movie> movieList = new ArrayList<>();
        while (result.next()) {


            if (result.getRow() != 1) {
                result.previous();
            }

            Actor firstActor = new Actor(result.getInt("actor_id"), result.getString("actor_name"), result.getDate("actor_birthday"));

            movieList.add(new Movie(result.getInt("movie_id"),
                    result.getString("movie_name"),
                    result.getDate("movie_production_year"),
                    result.getString("movie_production_country"),
                    new Director(result.getInt("director_id"), result.getString("director_name"), result.getDate("director_birthday")),
                    makeActorList(result, result.getInt("movie_id"), firstActor)));

        }
        return movieList;
    }

}
