package entities;

public class Image extends Media {

    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public void increaseBrightness() {
        brightness++;
    }

    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        }
    }


    public void show() {
        System.out.println("IMAGE");
        System.out.println("Title: " + title +
                " | Brightness (" + brightness + "): " +
                "*".repeat(brightness));
    }
    @Override
    public void avvia() {
        show();
    }

}
