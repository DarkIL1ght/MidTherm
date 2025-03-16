package SmartControlSystem.Composite;

public class TV implements SmartDevice{
    Boolean state;
    public TV() {
        this.state = false;
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
        System.out.println("TV is turned "+ (state ? "ON" : "OFF"));
    }
}




