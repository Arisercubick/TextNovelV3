package src.entities.Hostile;

import java.util.Random;
public class MonsterNames {
    private String[] slimeNames;

    private Random rand = new Random();

    public String getSlime() {
        this.slimeNames = new String[]{"Woubble", "Bloppy", "Blob", "Waddle", "Glorb"};

        int num = this.rand.nextInt(this.slimeNames.length);
        return this.slimeNames[num];
    }

}
