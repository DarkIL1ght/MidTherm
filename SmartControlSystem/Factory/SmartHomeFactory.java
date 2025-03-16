package SmartControlSystem.Factory;

import SmartControlSystem.Composite.SmartDevice;

interface SmartHomeFactory {
    SmartDevice createLight();
    SmartDevice createTV();
    SmartDevice createThermostat(double temp);
}
