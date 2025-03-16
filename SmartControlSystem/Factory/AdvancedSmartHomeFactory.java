package SmartControlSystem.Factory;

import SmartControlSystem.Composite.Light;
import SmartControlSystem.Composite.SmartDevice;
import SmartControlSystem.Composite.TV;
import SmartControlSystem.Composite.Thermostat;
import SmartControlSystem.Decorator.ScheduledOperationDecorator;

public class AdvancedSmartHomeFactory implements SmartHomeFactory{
    @Override
    public SmartDevice createLight() {
        return new ScheduledOperationDecorator(new Light());
    }

    @Override
    public SmartDevice createTV() {
        return new ScheduledOperationDecorator(new TV());
    }

    @Override
    public SmartDevice createThermostat(double temp) {
        return new ScheduledOperationDecorator(new Thermostat(temp));
    }
}
