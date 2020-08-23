package Lesson_1.homeWork;

import org.springframework.stereotype.Component;

@Component ("therapist")
public class Therapist implements IDoctor {


    private static final String name = "Therapist";

    @Override
    public void getDataTime() {
        System.out.println("Время приема ТЕРАПЕВТА: ");
        System.out.println("Дата: 20.08.2020");
        System.out.println("Время: 15.00");
    }

//    @Override
//    public String getName() {
//        return name;
//    }
}
