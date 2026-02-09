public class Player {
	public int health;
	public int base_defence;
	public int base_attack;
	public String name;
	
	public void playerDefault(String chosenName) {
		this.health = 100;
		this.base_attack = 5;
		this.base_defence = 3;
		this.name = chosenName;
	}
	
	// Boolean flags of the game
	
	public boolean haveDoneTheTutorial;
}