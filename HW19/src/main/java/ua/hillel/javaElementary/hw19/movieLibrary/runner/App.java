package ua.hillel.javaElementary.hw19.movieLibrary.runner;

import ua.hillel.javaElementary.hw19.movieLibrary.engine.MovieLibrary;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        MovieLibrary movieLibrary = null;
        try {
            movieLibrary = new MovieLibrary();
            System.out.println(movieLibrary.findActorsFromMovie("Sully"));
            System.out.println();
            System.out.println(movieLibrary.findMoviesByAge(6));
            System.out.println();
            System.out.println(movieLibrary.findActorsInManyMovies(2));
            System.out.println();
            System.out.println(movieLibrary.findActorsAsDirectors());
            System.out.println();
            int movieAge = 3;
            System.out.println("Removed " + movieLibrary.removeMoviesOlderThanGivenYears(movieAge) + " movies older than " +
                    movieAge + " years");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                movieLibrary.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
