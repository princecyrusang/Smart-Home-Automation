public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        Device light = new Light();
        Device speaker = new Speaker();
        Device musicPlayer = new MusicPlayer();

        controller.addDevice(light);
        controller.addDevice(speaker);
        controller.addDevice(musicPlayer);

        // Turn on all devices
        controller.sendCommand(new TurnOnCommand());

        // Adjust individual properties:
        light.executeCommand(new SetBrightnessCommand(80));
        speaker.executeCommand(new SetVolumeCommand(15));
        musicPlayer.executeCommand(new PlayMusicCommand("Lo-Fi Beats"));

        // Turn off all devices
        controller.sendCommand(new TurnOffCommand());
    }
}
