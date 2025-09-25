public class TurnOffCommand implements Command {
    @Override
    public void execute(Device device) {
        if (device instanceof Light) {
            ((Light) device).turnOff();
        } else if (device instanceof Speaker) {
            ((Speaker) device).turnOff();
        } else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).turnOff();
        }
    }
}
