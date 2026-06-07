import entities.*;
import interfaces.Play;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Media[] multimedia = new Media[5];

        System.out.println("Create 5 multimedia files");

        for (int i = 0; i < multimedia.length; i++) {

            System.out.println("Choose type:");
            System.out.println("1 = Image");
            System.out.println("2 = Audio");
            System.out.println("3 = Video");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter title:");
            String title = sc.nextLine();

            switch (type) {
                case 1 -> {
                    System.out.println("Enter brightness (0–10):");
                    int brightness = sc.nextInt();
                    multimedia[i] = new Image(title, brightness);
                }

                case 2 -> {
                    System.out.println("Enter duration (0–10):");
                    int duration = sc.nextInt();
                    System.out.println("Enter volume (0–10):");
                    int volume = sc.nextInt();
                    multimedia[i] = new Audio(title, duration, volume);
                }

                case 3 -> {
                    System.out.println("Enter brightness (0–10):");
                    int brightness = sc.nextInt();
                    System.out.println("Enter volume (0–10):");
                    int volume = sc.nextInt();
                    System.out.println("Enter duration (0–10):");
                    int duration = sc.nextInt();
                    multimedia[i] = new Video(title, brightness, duration, volume);
                }

                default -> {
                    System.out.println("Invalid type, try again.");
                    i--; // ripete l’indice
                }
            }
        }

        int choice = -1;
        while (choice != 0) {
            System.out.println("\nChoose file to execute (1–5) or 0 to exit:");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {
                Media selected = multimedia[choice - 1];

                if (selected instanceof Image img) {
                    img.show();
                } else if (selected instanceof Play player) {
                    player.play();
                }
            }
        }

        System.out.println("Program ended.");
    }
}
