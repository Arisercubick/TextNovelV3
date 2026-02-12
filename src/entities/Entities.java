package src.entities;

public class Entities {
    private int maxHP;
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

    public boolean getisAlive() {
        return this.isAlive;
    }

    public void setHP(int hp) {
        final int MINIMUM = 0;
        if (hp > MINIMUM && hp <= this.maxHP) {
            this.health = hp;
        } if (this.health > MINIMUM) {
            // Does nothing
        } else {
            this.health = 0;
            this.isAlive = false;
        }
    }

    public int getHealth() {
        return this.health;
    }

    public void setMAXHP(int hp) {
        final int MINIMUM = 0;

        if (hp > MINIMUM) {
            this.maxHP = hp;
        } else {
            this.health = 0;
            this.isAlive = false;
        }
    }

    private int base_defence;

    public void setBase_defence(int def) {
        final int MINIMUM = 0;
        if (def > MINIMUM) {
            this.base_defence = def;
        } else if (this.base_defence > 0) {
                // Does nothing
        }else {
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
        } else if (this.base_attack > 0) {
            // Does nothing
        } else {
            this.base_attack = 0;
        }
    }

    public int getBase_defence() {
        return this.base_defence;
    }

    private int critChance;

    public int getCritChance() {
        return this.critChance;
    }

    public void setCritChance(int crit) {
        final int MINIMUM = 0;
        final int MAXIMUM = 100;

        if (crit > MINIMUM && crit <= MAXIMUM) {
            this.critChance = crit;
        } else if (this.critChance > MINIMUM && crit <= MAXIMUM) {
            // Does nothing
        } else {
            this.critChance = 0;
        }
    }

}
