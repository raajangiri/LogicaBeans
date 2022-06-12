package com.raajan.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String genre;
    private double rating;
    private double watchTime;
    private int releaseYear;

    public Movie() {
    }

    public Movie(String title, String genre, double rating, double watchTime, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.watchTime = watchTime;
        this.releaseYear = releaseYear;
    }

    // getters and setters, equals(), toString(), ... (omitted for brevity)
}