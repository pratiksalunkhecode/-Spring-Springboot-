package read_data_query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class main {

    public static void main(String[] args) {


        Configuration c= new Configuration();

        SessionFactory sf = c.configure("hibernate-annotation-read.xml").buildSessionFactory();

        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

        Customer customer = new Customer();
        customer.setName("Aditya");
        customer.setAddress("Delhi");


        for (int i = 0; i < 100; i++) {
           customer = new Customer();
            customer.setName("Aditya " + i);
            customer.setAddress("Delhi" + i);
            s.save(customer);

        }

        s.flush();
       tx.commit();

        Transaction tx1 = s.beginTransaction();

        Query q1 = s.createQuery("from Customer where id=:id");
        q1.setParameter("id",4);
       Customer cus = (Customer) q1.uniqueResult();
        System.out.println(cus);
        tx1.commit();

        Transaction tx2 = s.beginTransaction();
        Query q2 = s.createQuery("from Customer");
        List<Customer> customerList = q2.list();
        for (Customer customer1 : customerList) {
            System.out.println(customer1);
        }
        tx2.commit();


    }

}

