public class TurnOnCommand implements Command {
    @Override
    public void execute(Device device) {
        if (device instanceof Light) {
            ((Light) device).turnOn();
        } else if (device instanceof Speaker) {
            ((Speaker) device).turnOn();
        } else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).turnOn();
        }
    }
}
