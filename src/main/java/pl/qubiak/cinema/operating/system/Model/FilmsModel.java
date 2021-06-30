package pl.qubiak.cinema.operating.system.Model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class FilmsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    @Column(name = "year_of_production")
    private int yearOfProduction;

    public FilmsModel() {
    }

    public FilmsModel(int id, String name, String category, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.yearOfProduction = yearOfProduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
