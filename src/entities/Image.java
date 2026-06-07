package entities;

public class Image extends Media {

    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public void show() {
        System.out.println("IMAGE");
        System.out.println("Title: " + title +
                " | Brightness (" + brightness + "): " +
                "*".repeat(brightness));
    }
}
