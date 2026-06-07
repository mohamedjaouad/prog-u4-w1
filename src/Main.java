import entities.*;
import java.util.Scanner;

public class Main {
    private static int readValue0to10(Scanner scanner, String message) {
        int value;
        while (true) {
            System.out.println(message);
            value = scanner.nextInt();
            if (value >= 0 && value <= 10) {
                return value;
            }
            System.out.println("Value must be between 0 and 10. Try again.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Media[] media = new Media[5];

        System.out.println("Create 5 multimedia files");


        for (int i = 0; i < media.length; i++) {

            System.out.println("Choose type:");
            System.out.println("1 = Image");
            System.out.println("2 = Audio");
            System.out.println("3 = Video");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter title:");
            String title = scanner.nextLine();

            switch (type) {
                case 1 -> {
                    int brightness = readValue0to10(scanner, "Enter brightness (0–10):");
                    media[i] = new Image(title, brightness);
                }

                case 2 -> {
                    int duration = readValue0to10(scanner, "Enter duration (0–10):");
                    int volume = readValue0to10(scanner, "Enter volume (0–10):");
                    media[i] = new Audio(title, duration, volume);
                }

                case 3 -> {
                    int brightness = readValue0to10(scanner, "Enter brightness (0–10):");
                    int volume = readValue0to10(scanner, "Enter volume (0–10):");
                    int duration = readValue0to10(scanner, "Enter duration (0–10):");
                    media[i] = new Video(title, brightness, duration, volume);
                }

                default -> {
                    System.out.println("Invalid type, try again.");
                    i--;
                }
            }

        }


        int choice = -1;
        while (choice != 0) {
            System.out.println("Choose a file to execute (1–5) or 0 to exit:");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                media[choice - 1].avvia();
            }
        }

        System.out.println("Program ended.");
    }
}
