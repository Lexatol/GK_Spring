package Lesson_3.Task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainTask1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Buyer.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Vendor.class)
                .buildSessionFactory();
        Session session = null;
        session = factory.getCurrentSession();

        session.beginTransaction();
        Buyer buyer = session.get(Buyer.class, 2);
        session.getTransaction().commit();


        session.beginTransaction();
        session.createQuery("delete from Buyer where idbuyer = :id").setParameter("id", "1").executeUpdate();
        session.getTransaction().commit();

        session.beginTransaction();
        session.createQuery("delete from Product where id_product = :id").setParameter("id", "1").executeUpdate();
        session.getTransaction().commit();

    }
}
