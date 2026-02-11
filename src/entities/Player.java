package src.entities;

public class Player {
	private int health;
	private int base_defence;
	private int base_attack;
	private String name;
	
	public void playerDefault(String chosenName) {
		this.health = 100;
		this.base_attack = 5;
		this.base_defence = 3;
		this.name = chosenName;
	}
	
	// Boolean flags of the game
	
	public boolean haveDoneTheTutorial;
}