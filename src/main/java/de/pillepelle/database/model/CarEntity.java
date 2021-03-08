package de.pillepelle.database.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "CarEntity.getAllCars", query = "select c from CarEntity c"),
                @NamedQuery(name = "CarEntity.getById", query = "select c from CarEntity c where c.id = :id")
        }
)
public class CarEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "model_identification", nullable = false)
    private String model;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER /* LAZY */, mappedBy = "car")
    private List<WheelEntity> wheels;


    @ManyToMany(mappedBy = "cars")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<PersonEntity> owners;

    public CarEntity(String model) {
        this.model = model;
    }

    public CarEntity()
    {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<WheelEntity> getWheels() {
        return wheels;
    }

    public List<PersonEntity> getOwners() {
        return owners;
    }


    public void setWheels(List<WheelEntity> wheels) {
		this.wheels = wheels;
	}

	@Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", owners=" + owners +
                '}';
    }
}
