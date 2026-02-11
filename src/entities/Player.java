package src.entities;

public class Player extends Entities {
	
	public void playerDefault(String chosenName) {
		this.setLvl(1);
		this.setisAlive(true);
		this.setHP(100);
		this.setBase_attack(10);
		this.setBase_defence(5);
		this.setName(chosenName);
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