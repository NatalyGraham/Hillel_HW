package ua.hillel.javaElementary.hw18.movieLibrary.source;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public interface MovieLibraryBDSource {
    ResultSet getDataByDate(String sqlSquery, LocalDate previousDate, LocalDate currentDate) throws SQLException;

    ResultSet getDataByName(String sqlQuery, String film) throws SQLException;

    //ResultSet getDataByDate(String sqlQuery, int filmsCount) throws SQLException;

    int removeFilmsOlderGivenYears(int givenYears) throws SQLException;

    void close() throws SQLException;
}
