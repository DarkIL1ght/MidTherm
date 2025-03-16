package SmartControlSystem.Decorator;

import SmartControlSystem.Composite.SmartDevice;

public class ScheduledOperationDecorator extends DeviceDecorator{
    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
    }
    @Override
    public void turnOn(){
        System.out.println("[Scheduled]");
        super.turnOn();
    }
}
