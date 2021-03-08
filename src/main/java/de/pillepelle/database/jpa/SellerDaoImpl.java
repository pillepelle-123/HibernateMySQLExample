package de.pillepelle.database.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.pillepelle.database.hibernate.SellerDao;
import de.pillepelle.database.model.CarEntity;
import de.pillepelle.database.model.SellerEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class SellerDaoImpl implements SellerDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(SellerEntity... sellerEntity) {
        for (SellerEntity p : sellerEntity)
        {
            entityManager.persist(p);
        }
    }

	public List<SellerEntity> getAllSellers() {
		return entityManager.createNamedQuery("SellerEntity.getAllSellers").getResultList();
	}
}
