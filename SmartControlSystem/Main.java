package SmartControlSystem;

import SmartControlSystem.Adapter.SecurityCamera;
import SmartControlSystem.Adapter.SecurityCameraAdapter;
import SmartControlSystem.Composite.Room;
import SmartControlSystem.Facade.SmartHomeController;
import SmartControlSystem.Factory.BasicSmartHomeFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Room livingRoom = new Room();
        livingRoom.addDevice(new BasicSmartHomeFactory().createLight());
        livingRoom.addDevice(new SecurityCameraAdapter(new SecurityCamera()));
        livingRoom.addDevice(new BasicSmartHomeFactory().createTV());
        livingRoom.addDevice(new BasicSmartHomeFactory().createThermostat(26));
        livingRoom.getstate();
        System.out.println();

        SmartHomeController controller = new SmartHomeController(livingRoom);
        controller.turnAllOn();
        controller.getAllinfo();
    }
}