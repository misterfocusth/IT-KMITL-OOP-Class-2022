/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_02;

/**
 *
 * @author misterfocusth
 */
public class Player {

    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;

    public Player(String name) {
        this(name, 20);
    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else if (hp > 20) {
            this.hp = 20;
        } else {
            this.hp = hp;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else if (mana > 50) {
            this.mana = 50;
        } else {
            this.mana = mana;
        }
    }

    public int getAttackDamage() {
        return this.attackDamage;
    }

    public String toString() {
        return "[Player] : " + this.name + " HP: " + this.hp + " Mana: " + this.mana + " || " + this.houses;
    }

    public boolean equals(Player player) {
        return this.name.equals(player.getName()) && this.houses.equals(player.getHouses());
    }

    public void attack(Player target, Spell spell) {
        if (this.houses instanceof Hufflepuff) {
            ((Hufflepuff) houses).attackSpell(this, target, spell);
        } else if (this.houses instanceof Gryffindor) {
            ((Gryffindor) houses).attackSpell(this, target, spell);
        }

        if (target.getHp() == 0) {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + this.name);
        }
    }

    public void protectedFromPlayer(Player target) {
        if (this.houses instanceof Hufflepuff) {
            ((Hufflepuff) houses).defense(this, target);
        } else if (this.houses instanceof Gryffindor) {
            ((Gryffindor) houses).defense(this, target);
        }
    }
}
