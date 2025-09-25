import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void sendCommand(Command cmd) {
        for (Device device : devices) {
            device.executeCommand(cmd);
        }
    }
}
