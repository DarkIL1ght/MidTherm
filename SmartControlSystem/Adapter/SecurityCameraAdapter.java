package SmartControlSystem.Adapter;

import SmartControlSystem.Composite.SmartDevice;

public class SecurityCameraAdapter implements SmartDevice {
    private SecurityCamera camera;

    public SecurityCameraAdapter(SecurityCamera camera) {
        this.camera = camera;
    }

    @Override
    public void turnOn() {
        camera.activate();
    }

    @Override
    public void turnOff() {
        System.out.println("Security camera can not turn off");
    }

    @Override
    public void getstate() {
        System.out.println("Security camera always turned on");
    }
}

