package Lesson_1.online;

import org.springframework.stereotype.Component;

@Component("BlackAndWhiteCameraRoll")

public class BlackAndWhiteCameraRoll implements ICameraRoll {

    @Override
    public void processing() {
        System.out.println("-1 черно белый кадр");
    }
}
