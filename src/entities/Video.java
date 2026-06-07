package entities;

import interfaces.Play;

public class Video extends Media implements Play {

    private int brightness;
    private int duration;
    private int volume;

    public Video(String title, int brightness, int duration, int volume) {
        super(title);
        this.brightness = brightness;
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println(" VIDEO ");
        for (int i = 0; i < duration; i++) {
            System.out.println("Title: " + title +
                    " | Volume (" + volume + "): " + "!".repeat(volume) +
                    " | Brightness (" + brightness + "): " + "*".repeat(brightness));
        }
    }
}
