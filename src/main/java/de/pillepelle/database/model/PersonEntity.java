package de.pillepelle.database.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class PersonEntity {

    @Id
    @GeneratedValue
    private int id;

    private Adress adress;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "OWNER_CAR"
    )
    private List<CarEntity> cars;

    public PersonEntity(String name, Adress adress, List<CarEntity> cars) {
        this.name = name;
        this.adress = adress;
        this.cars = cars;
    }

    public PersonEntity() {
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", adress=" + adress +
                ", name='" + name + '\'' +
                '}';
    }
}
