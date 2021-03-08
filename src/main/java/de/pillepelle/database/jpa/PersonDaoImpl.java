package de.pillepelle.database.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.pillepelle.database.hibernate.PersonDao;
import de.pillepelle.database.model.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(PersonEntity... personEntity) {
        for (PersonEntity p : personEntity)
        {
            entityManager.persist(p);
        }
    }
}
