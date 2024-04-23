package com.gfg_jbdl65.Hibernate_Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Configuration c= new Configuration();

        SessionFactory sf = c.configure("hibernate-mapping.xml").buildSessionFactory();

        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        Cart cart = new Cart();
        cart.setName("Pratik's Cart");

        Items i1 = new Items(1,"iphone15",1000,1,cart);
        Items i2 = new Items(1,"iphone15",1000,1,cart);

        Set<Items> itemsSet = new HashSet<>();
        itemsSet.add(i1);
        itemsSet.add(i2);

        cart.setItems(itemsSet);
        cart.setTotal(1*1000+2*1000);

        s.save(cart);

        s.save(i1);
        s.save(i2);


        s.flush();
        t.commit();
        s.close();
        sf.close();


    }

}
