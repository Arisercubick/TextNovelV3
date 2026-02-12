package src.entities;

import java.util.Random;

import src.Helper.TextManipulation;

public class Entities {
    private int maxHP;
    private int health;
    private boolean isAlive;
    private String name;
    private int lvl;
    private int base_defence;
    private int base_attack;
    private int critChance;
    private double critMultiplyer;

    // General move methods

    public void atk(Entities op) {
        TextManipulation text = new TextManipulation();
        Random rand = new Random();
        if (rand.nextInt(this.getCritChance()) >= 100) {
            text.println(this.name + " did a critical attack!!!");
            int dmg = this.base_attack * (int) rand.nextDouble(this.critMultiplyer);
            if (dmg <= this.base_defence/2) {
                dmg = 0;
            } else {
                dmg -= this.base_defence/2;
            }
            text.println(this.name + " did " + dmg + " to " + op.name);

            op.setHP(op.health-dmg);
        } else {
            
            text.println(this.name + " did an attack!!!");
            int dmg = this.base_attack;
            if (dmg <= this.base_defence/2) {
                dmg = 0;
            } else {
                dmg -= this.base_defence/2;
            }
            text.println(this.name + " did " + dmg + " to " + op.name);

            op.setHP(op.health-dmg);
        }
    }

    // set values 

    public void setCritMul(double crit) {
        if (crit > 1) {
            this.critMultiplyer = crit;
        } else if (this.critMultiplyer > 1) {
            // Does nothing
        } else {
            this.critMultiplyer = 1;
        }
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "greg";
        }
    }

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

    public void setisAlive(boolean life) {
        this.isAlive = life;
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

    public void setMAXHP(int hp) {
        final int MINIMUM = 0;

        if (hp > MINIMUM) {
            this.maxHP = hp;
        } else {
            this.health = 0;
            this.isAlive = false;
        }
    }

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

    // get values

    public int getLvl() {
        return this.lvl;
    }

    public String getName() {
        return this.name;
    }

    public boolean getisAlive() {
        return this.isAlive;
    }

    public int getHealth() {
        return this.health;
    }

    public int getBase_attack() {
        return this.base_attack;
    }

    public int getBase_defence() {
        return this.base_defence;
    }

    public int getCritChance() {
        return this.critChance;
    }

    public double getCritMul() {
        return this.critMultiplyer;
    }

    

}
