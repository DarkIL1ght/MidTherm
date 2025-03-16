package SmartControlSystem.Facade;

import SmartControlSystem.Composite.Room;
import SmartControlSystem.Composite.SmartDevice;

public class SmartHomeController {
    private Room room;

    public SmartHomeController(Room room) {
        this.room = room;
    }

    public void turnAllOn() {
        room.turnOn();
    }
    public void turnAllOff(){room.turnOff();}
    public void getAllinfo(){room.getstate();}
}
