package de.pillepelle.database.hibernate;

import de.pillepelle.database.model.PersonEntity;

public interface PersonDao {

    public void save(PersonEntity... personEntity);
    
}
