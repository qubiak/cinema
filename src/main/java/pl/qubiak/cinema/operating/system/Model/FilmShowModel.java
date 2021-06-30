package pl.qubiak.cinema.operating.system.Model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name= "film_show")
public class FilmShowModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "film_id")
    private int filmId;
    private Date date;
    private Time time;

    public FilmShowModel() {
    }

    public FilmShowModel(int id, int filmId, Date date, Time time) {
        this.id = id;
        this.filmId = filmId;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
