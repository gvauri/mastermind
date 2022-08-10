import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            int numberOne= 0;
            int numberTwo= 0;
            int numberThree= 0;

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
        String[] selectedColours = new String[4];
        do {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                int min = 0;
                int max = 7;
                int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
                selectedColours[i] = allColours[randomNumber];
            }
            System.out.println("You can guess the colours like this:");
            System.out.println("blue");
            System.out.println("red");
            System.out.println("orange");
            System.out.println("yellow");
            System.out.println(selectedColours[0] + selectedColours[1] + selectedColours[2] + selectedColours[3]);

            for (int j = 12; j > 0; j--) {
                System.out.println("The colours you can choose are blue, red, orange, yellow, green, black, white, grey.");
                int colourExists = 0;
                int colourCorrectPlace = 0;
                System.out.println("Now you can guess the colours:");
                System.out.println("You have " + j + " tries left.");
                String firstColour = scanner.nextLine();
                String secondColour = scanner.nextLine();
                String thirdColour = scanner.nextLine();
                String fourthColour = scanner.nextLine();
                String[] inputColours = {firstColour, secondColour, thirdColour, fourthColour};

                for (int i = 0; i < 4; i++) {
                    if (i == 0) {
                        numberOne= 1;
                        numberTwo= 2;
                        numberThree= 3;
                    } else if (i == 1){
                        numberOne= 1;
                        numberTwo= 2;
                        numberThree= -1;
                    }else if (i == 2){
                        numberOne= 1;
                        numberTwo= -2;
                        numberThree= -1;
                    }else if (i == 3){
                        numberOne= -3;
                        numberTwo= -2;
                        numberThree= -1;
                    }
                    if (selectedColours[i].equals(inputColours[i])) {
                        colourCorrectPlace = colourCorrectPlace + 1;
                    } else if (selectedColours[i].equals(inputColours[i+numberOne]) ||
                            selectedColours[i].equals(inputColours[i+numberTwo]) ||
                            selectedColours[i].equals(inputColours[i+numberThree])) {
                        colourExists = colourExists + 1;
                    }

                }

                /*if (selectedColours[0].equals(firstColour)) {
                    colourCorrectPlace += 1;
                } else if (selectedColours[0].equals(secondColour) ||
                        selectedColours[0].equals(thirdColour) ||
                        selectedColours[0].equals(fourthColour)) {
                    colourExists = colourExists + 1;
                }

                if (selectedColours[1].equals(secondColour)) {
                    colourCorrectPlace = colourCorrectPlace + 1;
                } else if (selectedColours[1].equals(firstColour) ||
                        selectedColours[1].equals(thirdColour) ||
                        selectedColours[1].equals(fourthColour)) {
                    colourExists = colourExists + 1;
                }
                if (selectedColours[2].equals(thirdColour)) {
                    colourCorrectPlace = colourCorrectPlace + 1;
                } else if (selectedColours[2].equals(secondColour) ||
                        selectedColours[2].equals(firstColour) ||
                        selectedColours[2].equals(fourthColour)) {
                    colourExists = colourExists + 1;
                }
                if (selectedColours[3].equals(fourthColour)) {
                    colourCorrectPlace = colourCorrectPlace + 1;
                } else if (selectedColours[3].equals(secondColour) ||
                        selectedColours[3].equals(thirdColour) ||
                        selectedColours[3].equals(firstColour)) {
                    colourExists = colourExists + 1;
                }
*/
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
            System.out.println("Do you want to play again?");
            System.out.println("Press y for yes or n for no.");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("y")) {
                System.out.println("You're back!");
            } else {
                break;
            }
        }while (true);
    }
}