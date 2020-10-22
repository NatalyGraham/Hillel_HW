package ua.hillel.javaElementary.hw19.movieLibrary.source;

import ua.hillel.javaElementary.hw19.movieLibrary.connectionDB.DBConn;

import java.sql.*;
import java.time.LocalDate;

public class HomeMovieDBBD implements MovieLibraryBDSource {
    private Connection connection;


    public HomeMovieDBBD() throws SQLException {
        connection = DBConn.getConnection();
    }

    @Override
    public ResultSet getDataByDate(String sqlQuery, LocalDate date) throws SQLException {
        PreparedStatement preparedStatement = getStatement(sqlQuery);
        preparedStatement.setDate(1, Date.valueOf(date));
        return preparedStatement.executeQuery();
    }

    @Override
    public ResultSet getDataByName(String sqlQuery, String movie) throws SQLException {
        PreparedStatement preparedStatement = getStatement(sqlQuery);
        preparedStatement.setString(1, movie);
        return preparedStatement.executeQuery();
    }

    @Override
    public ResultSet getDataByMovieQuantity(String sqlQuery, int movieCount) throws SQLException {
        PreparedStatement preparedSt = getStatement(sqlQuery);
        preparedSt.setInt(1, movieCount);
        return preparedSt.executeQuery();
    }

    @Override
    public ResultSet getDataDirector(String sqlQuery) throws SQLException {
        PreparedStatement preparedSt = getStatement(sqlQuery);
        return preparedSt.executeQuery();
    }

    @Override
    public int removeMoviesOlderThenGivenDate(String sqlQuery, LocalDate date) throws SQLException {
        PreparedStatement preparedSt = getStatement(sqlQuery);
        preparedSt.setDate(1, Date.valueOf(date));
        return preparedSt.executeUpdate();
    }

    private PreparedStatement getStatement(String sqlQuery) throws SQLException {
        PreparedStatement st = connection.prepareStatement(sqlQuery, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        return st;
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }


}
