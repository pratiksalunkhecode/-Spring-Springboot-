package OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class one2onemain {

    public static void main(String[] args) {

        Configuration c= new Configuration();

        SessionFactory sf = c.configure("hibernate-annotation-o2o.cfg.xml").buildSessionFactory();


        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        OnetoOne.Transaction tx = new OnetoOne.Transaction();

        tx.getAmount(1000);

        Customer customer = new Customer(1, "Aditya", "a@a.com",tx);
        tx.setCustomer(customer);

        s.save(tx);
        customer.setId(tx.getId());
        s.save(customer);


        s.flush();
        t.commit();
        s.close();
        sf.close();









    }

}
