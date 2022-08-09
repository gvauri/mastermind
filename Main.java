import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rarand = new Random();
        System.out.println("Welcome to Mastermind");
        String[] allColours={"blue","red","orange","yellow","green","black","white","grey"};
        String[] selectColours=new String[4];
        for (int i = 0; i < 4; i++) {
            int min=0;
            int max=7;
            int randomNumber =(int)Math.floor(Math.random()*(max-min+1)+min);
            selectColours[i]=allColours[randomNumber];
        }
        System.out.println("The colours you can choose are ,blue ,red,orange,yellow,green,black,white,grey.");
        System.out.println("You can give the colours for example:");
        System.out.println("blue");
        System.out.println("red");
        System.out.println("orange");
        System.out.println("yellow");

        for (int j = 0; j < 12; j++) {
            System.out.println("Now you can guess the colours.");
            Scanner myScanner = new Scanner(System.in);
            String firstColour = myScanner.nextLine();
            String secondColour = myScanner.nextLine();
            String thirdColour = myScanner.nextLine();
            String fourthColour = myScanner.nextLine();
            for (int a = 0; a < 4; a++) {
              switch (selectColours[a]){
                    case firstColour:

                        break;
                    case secondColour:

                        break;
                    case thirdColour:

                        break;
                    case fourthColour:
                        break;
                }

            }
        }

    }
}
