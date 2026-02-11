package src.entities;

public class Entities {
    private int health;
    private boolean isAlive;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    private int lvl;

    public void setLvl(int level) {
        final int MINIMUM = 0;
        if (level > MINIMUM) {
            this.lvl = level;
        } else if (this.lvl > MINIMUM) {
            // Does nothing
        } else {
            this.lvl = 1;
        }
    }

    public int getLvl() {
        return this.lvl;
    }

    public String getName() {
        return this.name;
    }

    public void setisAlive(boolean life) {
        this.isAlive = life;
    }

    public void setHP(int hp) {
        final int MINIMUM = 0;
        if (hp > MINIMUM) {
            this.health = hp;
        } else {
            this.health = 0;
            this.isAlive = false;
        }
    }

    public int getHealth() {
        return this.health;
    }
    private int base_defence;

    public void setBase_defence(int def) {
        final int MINIMUM = 0;
        if (def > MINIMUM) {
            this.base_defence = def;
        } else {
            this.base_defence = 0;
        }
    }

    public int getBase_attack() {
        return this.base_attack;
    }

    private int base_attack;

    public void setBase_attack(int atk) {
        final int MINIMUM = 0;
        if (atk > MINIMUM) {
            this.base_attack = atk;
        } else {
            this.base_attack = 0;
        }
    }

    public int getBase_defence() {
        return this.base_defence;
    }


}
