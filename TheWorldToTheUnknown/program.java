package TheWorldToTheUnknown;
import TheWorldToTheUnknown.Helper.*;
import java.util.Scanner;
import TheWorldToTheUnknown.entities.*;
public class program {
    public static TextManipulation text = new TextManipulation();
	public static Interaction interact = new Interaction();
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            text.println("Welcome to The World To The Uknown. A game made by Aris John Apolinario", 100);
            text.print("Do you wish to continue? (y/n): ", 100);
            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                quit = true;
                reader.close();
                pGame();
            } else if (answer.toLowerCase().equals("n")) {
                quit = true;
				reader.close();
            } else {
                text.println("Please put in the right response", 100);
            }
        }
    }

    public static void pGame() {
		Player player = new Player();
		Scanner reader = new Scanner(System.in);
		
		text.print("Choose youre username: ");
		String username = reader.nextLine();
		System.out.println();
		player.playerDefault(username);
		
		if (interact.yOrN("Do you want to do the tutorial? (y/n): ") && !player.haveDoneTheTutorial) {
			
    }
}
