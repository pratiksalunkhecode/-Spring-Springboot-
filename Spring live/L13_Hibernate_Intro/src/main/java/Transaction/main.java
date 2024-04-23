package Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

    public static void main(String[] args) {

        Configuration c = new Configuration();

        SessionFactory sf = c.configure("hibernatetr-config.xml").buildSessionFactory();

        System.out.println(sf);

        Session session = sf.openSession();

        EmployeeTr e = new EmployeeTr(1,"Pratik s",24);

       // System.out.println(e);

        Transaction tx = session.beginTransaction();

        session.save(e);
        tx.commit();
        session.close();






    }

}
