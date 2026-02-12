package src.entities;

import java.util.Random;
import src.Helper.*;


public class Player extends Entities {
	
	public void playerDefault(String chosenName) {
		this.setLvl(1);
		this.setisAlive(true);
		this.setHP(100);
		this.setBase_attack(10);
		this.setBase_defence(5);
		this.setName(chosenName);  
		this.setCritChance(10);
	}
	
	// Boolean flags of the game
	
	private boolean haveDoneTutorial;

	public void setHaveDoneTutorial(boolean set) {
		this.haveDoneTutorial = set;
	}

	public boolean getHaveDoneTutorial() {
		return this.haveDoneTutorial;
	}

	public void atk(Entities op) {
		Random rand = new Random();
		TextManipulation text = new TextManipulation();
		if (this.getCritChance() >= 100) {
			text.println("You deal a critical blow");
			int dmg = this.getBase_attack() * rand.nextInt(this.getBase_attack());
            text.println(this.getName() + " did " + dmg + " to " + op.getName());

            op.setHP(op.getHealth()-dmg);
		} else {
			text.println("You did an attack!!!");
            int dmg = this.getBase_attack();
            text.println(this.getName() + " did " + dmg + " to " + op.getName());

            op.setHP(op.getHealth()-dmg);
		}
	}
}