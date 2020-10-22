package ua.hillel.javaElementary.hw19.movieLibrary.source;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public interface MovieLibraryBDSource {
    ResultSet getDataByDate(String sqlQuery, LocalDate date) throws SQLException;

    ResultSet getDataByName(String sqlQuery, String movie) throws SQLException;

    ResultSet getDataByMovieQuantity(String sqlQuery, int movieCount) throws SQLException;

    ResultSet getDataDirector(String sqlQuery) throws SQLException;

    int removeMoviesOlderThenGivenDate(String sqlQuery, LocalDate date) throws SQLException;

    void close() throws SQLException;
}
