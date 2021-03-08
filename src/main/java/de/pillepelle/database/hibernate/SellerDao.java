package de.pillepelle.database.hibernate;

import java.util.List;

import de.pillepelle.database.model.SellerEntity;

public interface SellerDao {

    public void save(SellerEntity... sellerEntity);
    public List<SellerEntity> getAllSellers();
    
}
