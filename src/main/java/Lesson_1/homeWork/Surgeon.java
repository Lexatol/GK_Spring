package Lesson_1.homeWork;

import org.springframework.stereotype.Component;

@Component ("surgeon")
public class Surgeon implements IDoctor {

    private String name = "Surgeon";

    @Override
    public void getDataTime() {
        System.out.println("Время приема ХИРУРГА: ");
        System.out.println("Дата: 21.08.2020");
        System.out.println("Время: 9.00");
    }

//    @Override
//    public String getName() {
//        return name;
//    }
}

