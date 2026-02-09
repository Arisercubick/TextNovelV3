package src.Helper;
import java.util.Scanner;
import src.entities.*;


public class Interaction {
	// The tutorial
	public void tutorial(Player player) {
		TextManipulation text = new TextManipulation();
		player.haveDoneTheTutorial = true;
	}
		
	
	public boolean yOrN(String question) {
		Scanner reader = new Scanner(System.in);
		TextManipulation text = new TextManipulation();
		boolean noChoice = true;
		boolean answerBol = false;
		System.out.println();
		while (noChoice) {
			text.print(question, 100);

            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                noChoice = false;
                answerBol = true;
            } else if (answer.toLowerCase().equals("n")) {
                noChoice = false;
				answerBol = false;
            } else {
                text.println("Please put in the right response", 100);
            }
        }
		
		return answerBol;
	}
}