public class Speaker implements Device {
    private boolean isOn = false;
    private int volume = 10;

    @Override
    public void executeCommand(Command cmd) {
        cmd.execute(this);
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Speaker turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Speaker turned OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Speaker volume set to " + volume);
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}
