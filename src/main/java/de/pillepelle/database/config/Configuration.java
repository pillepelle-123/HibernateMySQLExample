package de.pillepelle.database.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.pillepelle.database.hibernate.CarDao;
import de.pillepelle.database.hibernate.PersonDao;
import de.pillepelle.database.hibernate.SellerDao;
import de.pillepelle.database.model.Adress;
import de.pillepelle.database.model.CarEntity;
import de.pillepelle.database.model.PersonEntity;
import de.pillepelle.database.model.SellerEntity;
import de.pillepelle.database.model.WheelEntity;

import java.util.Arrays;
import java.util.List;

@Repository
public class Configuration implements InitializingBean {

    @Autowired
    CarDao carDao;

    @Autowired
    PersonDao personDao;
    
    @Autowired
    SellerDao sellerDao;
    

    private void configureDatabase()
    {
        System.out.println("Konfiguriere Datenbank..");



//        // Autos anlegen
//        CarEntity r8 = new CarEntity("R8");
//        CarEntity m3 = new CarEntity("M3");
//        
//        r8.setWheels(provideWheels(r8));
//        m3.setWheels(provideWheels(m3));
//
//
//        // Personen anlegen
//        PersonEntity personEntity = new PersonEntity("Markus", new Adress("Musterstraﬂe", 2), Arrays.asList(r8, m3));
//        personDao.save(personEntity);
//
//        SellerEntity sellerEntity = new SellerEntity("Hans Dieter", new Adress("Wagnerstr.",19),"Hamburg");
//        sellerDao.save(sellerEntity);
//        
        System.out.println("Konfiguration abgeschlossen");
    }

    public void afterPropertiesSet() throws Exception {
        configureDatabase();
    }
    
    private List<WheelEntity> provideWheels(CarEntity car)
    {
        return Arrays.asList(
                new WheelEntity(car),
                new WheelEntity(car),
                new WheelEntity(car),
                new WheelEntity(car)
        );
    }
}


