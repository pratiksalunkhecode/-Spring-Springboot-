package com.gfg.L13_Hibernate_Intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfigMain {


    public static void main(String[] args) {

        Configuration c = new Configuration();

        SessionFactory sf = c.configure("hibernate.config.xml").buildSessionFactory();

        System.out.println(sf);

        Session s = sf.openSession();

        Employee e = new Employee(1000,"pratik",23);

        s.save(e);
        s.close();





    }

}
