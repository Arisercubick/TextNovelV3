package TheWorldToTheUnknown;
import TheWorldToTheUnknown.Helper.TextManipulation;
import java.util.Scanner;
public class program {

    public static TextManipulation text = new TextManipulation();
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Boolean quit = false;
        while (!quit) {
            text.println("Welcome to The World To The Uknown. A game made by Aris John Apolinario", 100);
            text.print("Do you wish to continue? (y/n): ", 100);
            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                quit = true;
                reader.close();
                playGame();
            } else if (answer.toLowerCase().equals("n")) {
                quit = true;
            } else {
                text.println("Please put in the right response", 100);
            }
        }
    }

    public static void playGame() {
        text.print("test", 100);
    }
}
