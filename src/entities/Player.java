package src.entities;

import java.util.Random;
import src.Helper.*;


public class Player extends Entities {
	
	public void Player(String chosenName) {
		this.setLvl(1);
		this.setisAlive(true);
		this.setMAXHP(100);
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
}