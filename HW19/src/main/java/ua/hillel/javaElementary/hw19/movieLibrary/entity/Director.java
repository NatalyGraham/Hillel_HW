package ua.hillel.javaElementary.hw19.movieLibrary.entity;

import java.util.Date;

public class Director extends Entity {

    private String name;
    private Date birthday;

    public Director(int id, String name, Date birthday) {
        super(id);
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ", " + birthday;
    }
}
