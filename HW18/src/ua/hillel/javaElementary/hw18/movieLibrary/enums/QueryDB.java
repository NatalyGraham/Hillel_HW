package ua.hillel.javaElementary.hw18.movieLibrary.enums;

public enum QueryDB {

    ACTORS_FROM_FILM("SELECT movies.*, actors.* FROM actors JOIN movies_actors ON actors.actor_id = movies_actors.actor_id \n" +
            "JOIN movies ON movies_actors.movie_id = movies.movie_id WHERE movies.movie_name = ?;"),
    MOVIES_BY_PRODUCTION_YEAR("SELECT movies.*, actors.*, directors.* FROM actors \n" +
            "JOIN movies_actors ON actors.actor_id = movies_actors.actor_id\n" +
            "JOIN movies ON movies_actors.movie_id = movies.movie_id \n" +
            "JOIN directors ON movies.movie_director_id = directors.director_id\n" +
            "WHERE DATE(movie_production_year) >= ?;"),
    ACTORS_FROM_N_FILM("SELECT actors.* FROM actors\n" +
            "JOIN movies_actors ON actors.actor_id = movies_actors.actor_id\n" +
            "GROUP BY actor_id\n" +
            "HAVING COUNT(*) = ?;"),
    ACTORS_AS_DIRECTORS("SELECT * FROM movie_library.actors WHERE asdirector_id BETWEEN 300 AND 399;"),
    REMOVE_MOVIES_BY_GIVEN_YEAR("DELETE FROM movie_library.movies WHERE DATE(movie_production_year) >= ?;")//,
    /*TABLE_SIZE("SELECT COUNT(*) AS quantity FROM movie_library.movies;")//*/;


    private String dbQuery;

    QueryDB(String dbQuery) {
        this.dbQuery = dbQuery;
    }

    public String getDbQuery() {
        return dbQuery;
    }
}
