public class PlayMusicCommand implements Command {
    private String playlist;

    public PlayMusicCommand(String playlist) {
        this.playlist = playlist;
    }

    @Override
    public void execute(Device device) {
        if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).play(playlist);
        } else {
            System.out.println("Play music not supported for this device.");
        }
    }
}