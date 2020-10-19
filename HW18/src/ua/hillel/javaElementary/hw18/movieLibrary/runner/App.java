package ua.hillel.javaElementary.hw18.movieLibrary.runner;

import ua.hillel.javaElementary.hw18.movieLibrary.engine.MovieLibrary;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        MovieLibrary worker = null;
        try {
            worker = new MovieLibrary();
            System.out.println(worker.findActorsFromFilm("Sully"));
            System.out.println();
            System.out.println(worker.findMoviesByAge(6)); ;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                worker.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
