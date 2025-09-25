public class SetVolumeCommand implements Command {
    private int volume;

    public SetVolumeCommand(int volume) {
        this.volume = volume;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof Speaker) {
            ((Speaker) device).setVolume(volume);
        } else {
            System.out.println("Volume not supported for this device.");
        }
    }
}
