package models;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private Genre genre;
    private Rating rating;

    public Film(){}

    public Film(String title, Genre genre, Rating rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "genre")
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "rating")
    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}

