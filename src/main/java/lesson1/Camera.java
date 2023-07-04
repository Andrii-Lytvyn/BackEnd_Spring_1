package lesson1;

public class Camera {
    private CameraRoll cameraRoll;

    public Camera(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Click");
        cameraRoll.processing();
    }
}
