import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;

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
        String[] allColoursSmall = {"blue", "red", "orange", "yellow", "green", "black", "white", "grey"};
        String[] selectedColours = new String[4];
        do {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                int min = 0;
                int max = 7;
                int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
                selectedColours[i] = allColoursSmall[randomNumber];
            }
            System.out.println("You can guess the colours like this:");
            System.out.println("blue");
            System.out.println("red");
            System.out.println("orange");
            System.out.println("yellow");
            //System.out.println(selectedColours[0] + selectedColours[1] + selectedColours[2] + selectedColours[3]);

            for (int j = 12; j > 0; j--) {
                System.out.println("The colours you can choose are blue, red, orange, yellow, green, black, white, grey.");
                int colourExists = 0;
                int colourCorrectPlace = 0;
                System.out.println("Now you can guess the colours:");
                System.out.println("You have " + j + " tries left.");
                String firstColour = scanner.nextLine().toLowerCase();

                String secondColour = scanner.nextLine().toLowerCase();

                String thirdColour = scanner.nextLine().toLowerCase();

                String fourthColour = scanner.nextLine().toLowerCase();

                String[] inputColours = {firstColour, secondColour, thirdColour, fourthColour};
                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        numberOne = 1;
                        numberTwo = 2;
                        numberThree = 3;
                    } else if (i == 1) {
                        numberOne = 1;
                        numberTwo = 2;
                        numberThree = -1;
                    } else if (i == 2) {
                        numberOne = 1;
                        numberTwo = -2;
                        numberThree = -1;
                    } else {
                        numberOne = -3;
                        numberTwo = -2;
                        numberThree = -1;
                    }

                    if (selectedColours[i].equals(inputColours[i])) {
                        colourCorrectPlace = colourCorrectPlace + 1;
                        inputColours[i] = "";
                    } else if (selectedColours[i].equals(inputColours[i + numberOne])) {
                        colourExists = colourExists + 1;
                        inputColours[i + numberOne] = "";
                    } else if (selectedColours[i].equals(inputColours[i + numberTwo])) {
                        colourExists = colourExists + 1;
                        inputColours[i + numberTwo] = "";
                    } else if (selectedColours[i].equals(inputColours[i + numberThree])) {
                        colourExists = colourExists + 1;
                        inputColours[i + numberThree] = "";
                    }

                }

                if (colourExists == 0 ||
                        colourExists == 1) {
                    System.out.println("You have " + colourExists + " colour right but in the wrong place.");
                } else {
                    System.out.println("You have " + colourExists + " colours right but in the wrong place.");
                }
                if (colourCorrectPlace == 0 ||
                        colourCorrectPlace == 1) {
                    System.out.println("You have " + colourCorrectPlace + " colours at the right place.");
                } else {
                    System.out.println("You have " + colourCorrectPlace + " colours at the right place.");
                }


                if (colourCorrectPlace == 4) {
                    System.out.println("You won!");
                    break;
                }

                if (j == 1) {
                    System.out.println("You lost!");
                    System.out.println("You are bad and don't try again.");
                }
            }

            boolean ending = true;
            do {
                System.out.println("Do you want play again?");
                System.out.println("Press y for yes or n for no.");
                String playAgain = scanner.nextLine().toLowerCase();
                if (playAgain.equals("y")) {
                    System.out.println("You're back!");
                    break;
                } else if (playAgain.equals("n")) {
                    ending = false;
                    break;
                } else {
                    System.out.println("can you please enter y or n.");
                }
            } while (true);
            if (!ending) {
                break;
            }
        } while (true);
    }
}