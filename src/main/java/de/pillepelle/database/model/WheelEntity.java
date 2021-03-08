package de.pillepelle.database.model;

import javax.persistence.*;

@Entity
public class WheelEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    public WheelEntity() {
    }
    
    public WheelEntity(CarEntity car) {
    	this.car = car;
    }
    
    
    public void setCar(CarEntity car) {
        this.car = car;
    }

    @ManyToOne()
    private CarEntity car;

    @Override
    public String toString() {
        return "WheelEntity{" +
                "id=" + id +
                '}';
    }
}
