package Lesson_1.homeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("patient")
@Scope
public class Patient {
    private String name;
    private IDoctor doctor;
//    private Registry registry;

//    public Patient(String name, Registry registry) {
//        this.name = name;
//        this.registry = registry;
//    }
//
//    public Patient(String name) {
//        this.name = name;
//    }


    @Autowired
    @Qualifier("therapist")
    public void setDoctor (IDoctor doctor) {
        this.doctor = doctor;

    }

    public void getRegDoctor () { doctor.getDataTime();
    }
//
//    public void setDoctor(String name) {
//        registry.getDoctorDataTime(registry.getDoctor(name));
//    }
}


