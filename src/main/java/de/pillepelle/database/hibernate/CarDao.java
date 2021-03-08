package de.pillepelle.database.hibernate;

import java.util.List;

import de.pillepelle.database.model.CarEntity;

public interface CarDao {

    public List<CarEntity> getAllCars();
    public CarEntity findById(int id);
    public void save(CarEntity... cars);
    public void delete(CarEntity car);

}
