public class Light implements Device {
    private boolean isOn = false;
    private int brightness = 50;

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void executeCommand(Command cmd) {
        cmd.execute(this);
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light turned OFF");
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Light brightness set to " + brightness);
    }

    public int getBrightness() {
        return brightness;
    }
}
