import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("   ▄▄▄▄███▄▄▄▄      ▄████████    ▄████████     ███        ▄████████    ▄████████   ▄▄▄▄███▄▄▄▄    ▄█  ███▄▄▄▄   ████████▄  \n" +
                " ▄██▀▀▀███▀▀▀██▄   ███    ███   ███    ███ ▀█████████▄   ███    ███   ███    ███ ▄██▀▀▀███▀▀▀██▄ ███  ███▀▀▀██▄ ███   ▀███ \n" +
                " ███   ███   ███   ███    ███   ███    █▀     ▀███▀▀██   ███    █▀    ███    ███ ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
                " ███   ███   ███   ███    ███   ███            ███   ▀  ▄███▄▄▄      ▄███▄▄▄▄██▀ ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
                " ███   ███   ███ ▀███████████ ▀███████████     ███     ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   ███   ███   ███ ███▌ ███   ███ ███    ███ \n" +
                " ███   ███   ███   ███    ███          ███     ███       ███    █▄  ▀███████████ ███   ███   ███ ███  ███   ███ ███    ███ \n" +
                " ███   ███   ███   ███    ███    ▄█    ███     ███       ███    ███   ███    ███ ███   ███   ███ ███  ███   ███ ███   ▄███ \n" +
                "  ▀█   ███   █▀    ███    █▀   ▄████████▀     ▄████▀     ██████████   ███    ███  ▀█   ███   █▀  █▀    ▀█   █▀  ████████▀  \n" +
                "                                                                      ███    ███                                           ");
        System.out.println("Welcome to Mastermind");
        String[] allColours = {"blue", "red", "orange", "yellow", "green", "black", "white", "grey"};
        String[] selectColours = new String[4];
        do {
            Scanner myScanner = new Scanner(System.in);
            Random rarand = new Random();
            for (int i = 0; i < 4; i++) {
                int min = 0;
                int max = 7;
                int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
                selectColours[i] = allColours[randomNumber];
            }
            System.out.println("You can guess the colours like this:");
            System.out.println("blue");
            System.out.println("red");
            System.out.println("orange");
            System.out.println("yellow");
            System.out.println(selectColours[0] + selectColours[1] + selectColours[2] + selectColours[3]);

            for (int j = 0; j < 12; j++) {
                System.out.println("The colours you can choose are blue, red, orange, yellow, green, black, white, grey.");
                int colourCheck = 0;
                int colourPlace = 0;
                System.out.println("Now you can guess the colours:");
                int tries = 12 - j;
                System.out.println("You have " + tries + " tries left.");
                String firstColour = myScanner.nextLine();
                String secondColour = myScanner.nextLine();
                String thirdColour = myScanner.nextLine();
                String fourthColour = myScanner.nextLine();

                if (selectColours[0].equals(firstColour)) {
                    colourPlace = colourPlace + 1;
                } else if (selectColours[0].equals(secondColour) ||
                        selectColours[0].equals(thirdColour) ||
                        selectColours[0].equals(fourthColour)) {
                    colourCheck = colourCheck + 1;
                }

                if (selectColours[1].equals(secondColour)) {
                    colourPlace = colourPlace + 1;
                }
                if (selectColours[1].equals(firstColour) ||
                        selectColours[1].equals(thirdColour) ||
                        selectColours[1].equals(fourthColour)) {
                    colourCheck = colourCheck + 1;
                }
                if (selectColours[2].equals(thirdColour)) {
                    colourPlace = colourPlace + 1;
                } else if (selectColours[2].equals(secondColour) ||
                        selectColours[2].equals(firstColour) ||
                        selectColours[2].equals(fourthColour)) {
                    colourCheck = colourCheck + 1;
                }
                if (selectColours[3].equals(fourthColour)) {
                    colourPlace = colourPlace + 1;
                } else if (selectColours[3].equals(secondColour) ||
                        selectColours[3].equals(thirdColour) ||
                        selectColours[3].equals(firstColour)) {
                    colourCheck = colourCheck + 1;
                }

                if (colourCheck == 0 ||
                        colourCheck == 1) {
                    System.out.println("You have " + colourCheck + " colour right but in the wrong place.");
                } else {
                    System.out.println("You have " + colourCheck + " colours right but in the wrong place.");
                }
                if (colourPlace == 0 ||
                        colourPlace == 1) {
                    System.out.println("You have " + colourPlace + " colours at the right place.");
                } else {
                    System.out.println("You have " + colourPlace + " colours at the right place.");
                }


                if (colourPlace == 4) {
                    System.out.println("You won!");
                    break;
                }

                if (j == 11) {
                    System.out.println("You lost!");
                    System.out.println("You are bad and don't try again.");
                }
            }
            System.out.println("Do you want to play again?");
            System.out.println("Press y for yes or n for no.");
            String again = myScanner.nextLine();
            if (again.equals("y")) {
                System.out.println("You're back!");
            } else {
                break;
            }
        }while (true);
    }
}