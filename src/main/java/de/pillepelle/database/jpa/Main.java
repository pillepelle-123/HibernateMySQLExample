package de.pillepelle.database.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.pillepelle.database.hibernate.CarDao;
import de.pillepelle.database.model.CarEntity;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jpa-config.xml");
        CarDao carDao = context.getBean(CarDao.class);

        for (CarEntity car : carDao.getAllCars())
        {
            System.out.println(car);
        }
    }

}
