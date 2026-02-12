package src.entities.Hostile;

import java.util.Random;
import src.Helper.*;
import src.entities.*;

public class Slime extends Entities {

    public Slime(int level) {
        MonsterNames name = new MonsterNames();
        this.setisAlive(true);
        this.setLvl(level);
        this.setMAXHP(5 + level * 10);
        this.setHP(5 + level * 10);
        this.getBase_attack();
        this.setBase_defence(level * 1 + this.getBase_attack()/3);
        this.setName(name.getSlime());
        this.setCritChance(level);
        this.setCritMul(level * 0.1 + 1);
    }


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
    

    public void slimeTurn(Entities op) {
        TextManipulation text = new TextManipulation();
        if (this.getisAlive()) {
            this.atk(op);
        } else {
            text.println(this.getName() + " is dead...", 120);
        }
    }

}