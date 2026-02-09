import java.util.Scanner;
import java.util.Random;
import TheWorldToTheUnknown.Helper.*;
import entities.*;

public class Interaction {
	
	// The tutorial
	public void tutorial(Player player) {
		
	
	public boolean yOrN(String question) {
		Scanner reader = new Scanner(System.in);
		TextManipulation text = new TextManispulation();
		boolean noChoice = true;
		boolean answerBol = false;
		System.out.println();
		while (noChoice) {
			text.print(question, 100);

            String answer = reader.next();
            if (answer.toLowerCase().equals("y")) {
                noChoice = true;
                reader.close();
                answerBol = true;
            } else if (answer.toLowerCase().equals("n")) {
                noChoice = true;
				reader.close();
				answerBol = false;
            } else {
                text.println("Please put in the right response", 100);
            }
        }
		
		return answerBol
	}
}