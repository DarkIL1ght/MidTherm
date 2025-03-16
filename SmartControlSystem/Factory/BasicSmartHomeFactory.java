package SmartControlSystem.Factory;

import SmartControlSystem.Composite.*;

public class BasicSmartHomeFactory implements SmartHomeFactory{
    @Override
    public SmartDevice createLight() {
        return new Light();
    }

    @Override
    public SmartDevice createTV() {
        return new TV();
    }

    @Override
    public SmartDevice createThermostat(double temp) {
        return new Thermostat(temp);
    }
}
