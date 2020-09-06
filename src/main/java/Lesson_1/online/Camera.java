package Lesson_1.online;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("camera")
@Scope("prototype")
public class Camera implements ICamera {


    private ICameraRoll cameraRoll;

@Autowired
@Qualifier("BlackAndWhiteCameraRoll")
    public void setCameraRoll(ICameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    @Override
    public void doPhotograph() {
        System.out.println("Щелк");
        cameraRoll.processing();
    }
}
