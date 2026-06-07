package entities;

import interfaces.Play;

public class Audio extends Media implements Play {

    private int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println(" AUDIO ");
        for (int i = 0; i < duration; i++) {
            System.out.println("Title: " + title +
                    " | Volume (" + volume + "): " +
                    "!".repeat(volume));
        }
    }
}
