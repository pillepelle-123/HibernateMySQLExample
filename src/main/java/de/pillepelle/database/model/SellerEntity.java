package de.pillepelle.database.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "SellerEntity.getAllSellers", query = "select c from SellerEntity c"),
                //@NamedQuery(name = "CarEntity.getById", query = "select c from CarEntity c where c.id = :id")
        }
)
public class SellerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String shopLocation;

    private Adress adress;

    private String name;

    /*
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "OWNER_CAR"
    )
    */
    //private List<CarEntity> cars;

    public SellerEntity(String name, Adress adress, String shopLocation ) { //List<CarEntity> cars) {
        this.name = name;
        this.adress = adress;
        //this.cars = cars;
        this.shopLocation = shopLocation;
    }

    public SellerEntity() {
    }

    @Override
    public String toString() {
        return "SellerEntity{" +
                "id=" + id +
                ", adress=" + adress +
                ", shopLoc" + shopLocation +
                ", name='" + name + '\'' +
                '}';
    }
}
