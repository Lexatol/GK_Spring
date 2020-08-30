package Lesson_3.Task2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernateStFa.cfg.xml")
                .addAnnotatedClass(Faculty.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = null;
        session = factory.getCurrentSession();

        session.beginTransaction();
        List<Student> students = session.createQuery("From Student where id_faculty = :faculty")
                                .setParameter("faculty", "1").getResultList();
        session.getTransaction().commit();
        System.out.println(students);
        System.out.println(students.stream().count());
    }
}
