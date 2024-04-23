package Many2Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {


        Configuration c= new Configuration();

        SessionFactory sf = c.configure("hibernate-mapping-m2m.xml").buildSessionFactory();

        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

        Cart cart = new Cart();
        cart.setName("Pratik's cart");

        Cart cart2 = new Cart();
        cart.setName("Pratik's secound cart");

        Items i1 = new Items(12,"iphone16",10,12);
        Items i2 = new Items(13,"iphone16",10,10);
        Items i3 = new Items(15,"samsung",20,10);
        Items i4 = new Items(16,"samsung a30s",10,5);

        Set<Items> itemsSet = new HashSet<Items>();
        itemsSet.add(i1);
        itemsSet.add(i2);

        cart.setItems(itemsSet);
        cart.setTotal(1*1000+2*1000);

        Set<Items> itemsSet1 = new HashSet<Items>();
        itemsSet1.add(i3);
        itemsSet1.add(i4);

        cart.setItems(itemsSet1);
        cart.setTotal(1*1000+2*1000);

        s.save(cart);
        s.save(cart2);

        s.save(i1);
        s.save(i2);
        s.save(i3);
        s.save(i4);


        s.flush();
        tx.commit();
        sf.close();

    }

}
