package SmartControlSystem.Composite;

public class Thermostat implements SmartDevice{
    private double temperature;
    double getTemperature;
    Boolean state;
    public Thermostat(double temperature) {
        state=false;
        this.temperature = temperature;
    }


    @Override
    public void turnOn() {
        state=true;
    }

    @Override
    public void turnOff() {
        state=false;
    }

    @Override
    public void getstate() {
        System.out.println("Thermostate is turned "+ (state ? ("On and temperature ="+temperature) : "OFF"));
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
