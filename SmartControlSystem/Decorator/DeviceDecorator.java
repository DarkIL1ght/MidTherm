package SmartControlSystem.Decorator;

import SmartControlSystem.Composite.SmartDevice;

public class DeviceDecorator implements SmartDevice {
    protected SmartDevice device;

    public DeviceDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void getstate() {
        device.getstate();
    }
}
