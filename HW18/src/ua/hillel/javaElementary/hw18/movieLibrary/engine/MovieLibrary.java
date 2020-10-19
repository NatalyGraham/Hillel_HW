package ua.hillel.javaElementary.hw18.movieLibrary.engine;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import ua.hillel.javaElementary.hw18.movieLibrary.entity.Actor;
import ua.hillel.javaElementary.hw18.movieLibrary.entity.Director;
import ua.hillel.javaElementary.hw18.movieLibrary.entity.Movie;
import ua.hillel.javaElementary.hw18.movieLibrary.enums.QueryDB;
import ua.hillel.javaElementary.hw18.movieLibrary.source.HomeMovieDBBD;

import java.sql.*;
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

    public List<Actor> findActorsFromFilm(String movieName) {
        List<Actor> actorList = new ArrayList<>();
        try (ResultSet result = myMovies.getDataByName(QueryDB.ACTORS_FROM_FILM.getDbQuery(), movieName)) {
            actorList = makeActorList(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;
    }

    public List<Movie> findMoviesByAge(int age) {  //List<Movie>

        List<Movie> movieList = new ArrayList<>();

        LocalDate currentDate = LocalDate.now();
        LocalDate previousDate = LocalDate.of(currentDate.getYear() - age, Month.JANUARY, 1);



        try (ResultSet result = myMovies.getDataByDate(QueryDB.MOVIES_BY_PRODUCTION_YEAR.getDbQuery(), previousDate, currentDate)) {
            movieList = makeMovieList(result);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movieList;
    }


    public void close() throws SQLException {
        myMovies.close();
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


        while (result.next() && result.getInt("movie_id") == movieID )  {

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
