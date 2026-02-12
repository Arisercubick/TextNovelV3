import java.util.Scanner;
import src.Helper.*;
import src.entities.Player;
// The program
public class program {
    public static TextManipulation text = new TextManipulation();
	public static Interaction interact = new Interaction();
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean quit = false;
        text.delete();
        text.println("Welcome to The World To The Uknown. A game made by Aris John Apolinario");
        while (!quit) {
            text.print("Do you wish to continue? (y/n): ");
            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                text.delete();
                pGame();
                text.println("Thank you for playing the game");
            } else if (answer.toLowerCase().equals("n")) {
                quit = true;
            } else {
                text.println("Please put in the right response");
            }
        }
    }

    public static void pGame() {
        Player player = new Player();
        Scanner reader = new Scanner(System.in);
        
        text.print("Choose your username: ");
        String username = reader.nextLine();
        System.out.println();
        player.playerDefault(username);

        if (interact.yOrN("Do you want to do the tutorial? (y/n): ") && !player.getHaveDoneTutorial()) {
            interact.tutorial(player);
        }
        player.playerDefault(username);
    }
}
