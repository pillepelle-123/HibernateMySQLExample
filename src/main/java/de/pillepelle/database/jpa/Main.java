package de.pillepelle.database.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.pillepelle.database.hibernate.CarDao;
import de.pillepelle.database.hibernate.SellerDao;
import de.pillepelle.database.model.CarEntity;
import de.pillepelle.database.model.SellerEntity;

public class Main {

    public static void main(String[] args)
    {
    	System.out.println("########### START PROGRAM ###########");
        ApplicationContext context = new ClassPathXmlApplicationContext("jpa-config.xml");
        CarDao carDao = context.getBean(CarDao.class);

        for (CarEntity car : carDao.getAllCars()) {
            System.out.println(car);
        }
        
        SellerDao sellerDao = context.getBean(SellerDao.class);
        
        for (SellerEntity seller : sellerDao.getAllSellers()) {
        	System.out.println(seller);
        }
        
        
    }

}
