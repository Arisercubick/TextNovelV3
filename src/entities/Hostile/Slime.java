package src.entities.Hostile;

import src.entities.*;

public class Slime extends Entities {

    private MonsterNames name = new MonsterNames();

    public void fillSlime(int level) {
        this.setisAlive(true);
        this.setLvl(level);
        this.setBase_attack(5 + level * 10);
        this.setBase_attack(level * 1 + this.getBase_attack()/3);
        this.setName(this.name.getSlime());
    }
}