package Lesson_1.homeWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//
//        Registry registry = new Registry();
//
//        Patient patient = new Patient("Petya", registry);
//        patient.setDoctor("Therapist");



        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Patient patient = context.getBean("patient", Patient.class);
        patient.getRegDoctor();
    }
}
