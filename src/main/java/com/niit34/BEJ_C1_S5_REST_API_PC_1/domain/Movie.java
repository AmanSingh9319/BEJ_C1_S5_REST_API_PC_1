/*
 *Author Name: Aman Singh
 *Date:20-11-2022
 *Created With: Intellij IDEA Community Edition
 */
package com.niit34.BEJ_C1_S5_REST_API_PC_1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private String movieName;
    private String actorName;
    private String directorNAME;
    private  int id;

    public Movie() {
    }

    public Movie(String movieName, String actorName, String directorNAME, int id) {
        this.movieName = movieName;
        this.actorName = actorName;
        this.directorNAME = directorNAME;
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorNAME() {
        return directorNAME;
    }

    public void setDirectorNAME(String directorNAME) {
        this.directorNAME = directorNAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actorName='" + actorName + '\'' +
                ", directorNAME='" + directorNAME + '\'' +
                ", id=" + id +
                '}';
    }
}
