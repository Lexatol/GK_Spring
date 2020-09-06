package Lesson4;

import Lesson4.entites.Product;
import Lesson4.entites.Vendor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mainLesson4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Vendor.class)
                .buildSessionFactory();

        Session session = null;

        session = factory.getCurrentSession();
    }
}
