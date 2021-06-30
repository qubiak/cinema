package pl.qubiak.cinema.operating.system.Model;

import javax.persistence.*;

@Entity
@Table(name = "token")
public class TokenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    @Column(name = "user_id")
    private int userId;

    public TokenModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public TokenModel(Long id, String value, int userId) {
        this.id = id;
        this.value = value;
        this.userId = userId;
    }
}