package Lesson_1.online;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ColorCameraRoll")
@Scope("prototype")

public class ColorCameraRoll implements ICameraRoll {

    @Override
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}
