package entities;

import interfaces.Play;

public class Audio extends Media implements Play {

    private final int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
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
    @Override
    public void avvia() {
        play();
    }

}
