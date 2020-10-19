package ua.hillel.javaElementary.hw18.movieLibrary.enums;

public enum QueryDB {

    ACTORS_FROM_FILM("SELECT movies.*, actors.* FROM actors JOIN movies_actors ON actors.actor_id = movies_actors.actor_id \n"+
            "JOIN movies ON movies_actors.movie_id = movies.movie_id WHERE movies.movie_name = ?;"),
    MOVIES_BY_PRODUCTION_YEAR("SELECT movies.*, actors.*, directors.* FROM actors \n" +
            "JOIN movies_actors ON actors.actor_id = movies_actors.actor_id\n" +
            "JOIN movies ON movies_actors.movie_id = movies.movie_id \n" +
            "JOIN directors ON movies.movie_director_id = directors.director_id\n" +
            "WHERE DATE(movie_production_year) BETWEEN ? AND ?;"),
    ACTORS_FROM_N_FILM(""),
    ACTORS_AS_DIRECTORS("SELECT * FROM movie_library.actors WHERE director_id BETWEEN 300 AND 400;"),
    DELETE_FILMS_BY_MORE_THEN_GIVEN_YEARS("");


    private String dbQuery;
    QueryDB(String dbQuery) {
        this.dbQuery = dbQuery;
    }
    public String getDbQuery(){
        return dbQuery;
    }
}
