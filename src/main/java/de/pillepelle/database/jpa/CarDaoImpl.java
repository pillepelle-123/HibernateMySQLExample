package de.pillepelle.database.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.pillepelle.database.hibernate.CarDao;
import de.pillepelle.database.model.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class CarDaoImpl implements CarDao {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional(readOnly = true)
    public List<CarEntity> getAllCars() {
        return entityManager.createNamedQuery("CarEntity.getAllCars").getResultList();
    }

    public CarEntity findById(int id) {
        return null;
    }

    public void save(CarEntity... cars) {
        for (CarEntity entity : cars)
        {
            entityManager.merge(entity);
        }
    }

    public void delete(CarEntity car) {

    }
}
