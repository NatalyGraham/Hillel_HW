package ua.hillel.javaElementary.hw19.movieLibrary.entity;

import java.util.Date;
import java.util.List;

public class Movie extends Entity {
    private Director director;
    private String name;
    private List<Actor> actors;
    private Date productionDate;
    private String productionCountry;

    public Movie(int id, String name, Date productionDate, String productionCountry, Director director, List<Actor> actors) {
        super(id);
        this.name = name;
        this.director = director;
        this.actors = actors;
        this.productionDate = productionDate;
        this.productionCountry = productionCountry;
    }

    public String toString() {
        return name + ", " + productionDate + ", " + productionCountry + "\nDirector: " + director.getName() + "\nActors: " +
                actors;
    }


}
