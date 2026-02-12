package src.Helper;
import java.util.Scanner;
import src.entities.*;


public class Interaction {
	// The tutorial
	public void tutorial(Player player) {
		TextManipulation text = new TextManipulation();
		player.setHaveDoneTutorial(true);
		text.delete();
		text.println("Welcome to the tutorial.\nHere we will show you the basic controls to get you started");

	}
		
	
	public boolean yOrN(String question) {
		Scanner reader = new Scanner(System.in);
		TextManipulation text = new TextManipulation();
		boolean noChoice = true;
		boolean answerBol = false;
		System.out.println();
		while (noChoice) {
			text.print(question);

            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                noChoice = false;
                answerBol = true;
            } else if (answer.toLowerCase().equals("n")) {
                noChoice = false;
				answerBol = false;
            } else {
                text.println("Please put in the right response");
            }
        }
		
		return answerBol;
	}

	public void printMons(String[] art) {
		System.out.println();
		for (int i = 0; i < art.length; i++) {
			System.out.println(art[i]);
		}
		System.out.println();
	}
}