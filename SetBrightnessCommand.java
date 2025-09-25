public class SetBrightnessCommand implements Command {
    private int brightness;

    public SetBrightnessCommand(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof Light) {
            ((Light) device).setBrightness(brightness);
        } else {
            System.out.println("Brightness not supported for this device.");
        }
    }
}

