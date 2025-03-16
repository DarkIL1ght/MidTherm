package SmartControlSystem.Composite;

public class Light implements SmartDevice{
    Boolean state;
    public Light(){
        state = false;
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
    public void getstate(){
        System.out.println("Light is turned "+ (state ? "ON" : "OFF"));
    }
}
