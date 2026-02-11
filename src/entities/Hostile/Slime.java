package src.entities.Hostile;

import src.Helper.*;
import src.entities.*;

public class Slime extends Entities {

    private MonsterNames name = new MonsterNames();


    public void printSlime() {
        Interaction interact = new Interaction();
        String[] slimeArt = {
        "          ██████████          ",
        "       ████        ████       ",
        "     ███              ███     ",
        "    ██    ██      ██    ██    ",
        "   ██      ██    ██      ██   ",
        "   ██        ████        ██   ",
        "    ██                ██      ",
        "      ███          ███        ",
        "         ██████████           "};
        interact.printMons(slimeArt);
    }
    public void fillSlime(int level) {
        this.setisAlive(true);
        this.setLvl(level);
        this.setHP(5 + level * 10);
        this.setBase_defence(level * 1 + this.getBase_attack()/3);
        this.setName(this.name.getSlime());
    }

     

    public void slimeTurn(Entities opponent) {
        // code
    }

    public int slimeAtk(Entities op) {
        return 4;
    }

}