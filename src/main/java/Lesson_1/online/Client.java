package Lesson_1.online;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICamera camera = context.getBean("camera", ICamera.class);
        camera.doPhotograph();


    }
}
