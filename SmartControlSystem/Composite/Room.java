package SmartControlSystem.Composite;

import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice{
    String name;
    private List<SmartDevice> devices = new ArrayList<>();


    public void addDevice(SmartDevice dev){
        devices.add(dev);
    }
    public List<SmartDevice> getDevices() {
        return devices;
    }
    public void deleteDevice(SmartDevice dev){
        devices.remove(dev);
    }
    @Override
    public void turnOn() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public void getstate() {
        for (SmartDevice device : devices) {
            device.getstate();
        }
    }
}
