public class MusicPlayer implements Device {
    private boolean isOn = false;

    @Override
    public void executeCommand(Command cmd) {
        cmd.execute(this);
    }

    public void turnOn() {
        isOn = true;
        System.out.println("MusicPlayer turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("MusicPlayer turned OFF");
    }

    public void play(String playlist) {
        if (isOn) {
            System.out.println("MusicPlayer is playing: " + playlist);
        } else {
            System.out.println("MusicPlayer is OFF. Cannot play music.");
        }
    }
}
