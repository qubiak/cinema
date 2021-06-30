package pl.qubiak.cinema.operating.system.Model;

import javax.persistence.*;

@Entity
@Table(name = "reservations")
public class ReservationsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "film_id")
    private int filmId;
    @Column(name = "filmShow_id")
    private int filmShowId;

    public ReservationsModel() {
    }

    public ReservationsModel(int id, int userId, int filmId, int filmShowId) {
        this.id = id;
        this.userId = userId;
        this.filmId = filmId;
        this.filmShowId = filmShowId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getFilmShowId() {
        return filmShowId;
    }

    public void setFilmShowId(int filmShowId) {
        this.filmShowId = filmShowId;
    }
}
