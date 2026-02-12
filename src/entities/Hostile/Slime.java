package src.entities.Hostile;

import java.util.Random;
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
        this.getBase_attack();
        this.setBase_defence(level * 1 + this.getBase_attack()/3);
        this.setName(this.name.getSlime());
        this.setCritChance(level);
    }

    public void slimeTurn(Entities op) {
        TextManipulation text = new TextManipulation();
        if (this.getisAlive()) {
            this.slimeAtk(op);
        } else {
            text.println(this.getName() + " is dead...", 120);
        }
    }

    public void slimeAtk(Entities op) {
        TextManipulation text = new TextManipulation();
        Random rand = new Random();
        if (rand.nextInt(this.getCritChance()) >= 100) {
            text.println(this.getName() + " did a critical attack!!!");
            int dmg = this.getBase_attack() * rand.nextInt(this.getBase_attack());
            text.println(this.getName() + " did " + dmg + " to " + op.getName());

            op.setHP(op.getHealth()-dmg);
        } else {
            text.println(this.getName() + " did an attack!!!");
            int dmg = this.getBase_attack();
            text.println(this.getName() + " did " + dmg + " to " + op.getName());

            op.setHP(op.getHealth()-dmg);
        }
    }

}