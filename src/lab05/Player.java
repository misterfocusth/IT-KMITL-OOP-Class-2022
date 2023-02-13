/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author misterfocusth
 */
public class Player {

    private String name;
    private String team;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setTeam(String t) {
        this.team = t;
    }

    public String getTeam() {
        return this.team;
    }

    public boolean isSameTeam(Player p) {
        return this.team.equals(p.team);
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");

        Player p2 = new Player();
        p2.setName("Khim");
        p2.setTeam("Gate OR");

        if (p1.isSameTeam(p2)) {
            System.out.println(p1.getName() + " is a same team with " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is not a same team with " + p2.getName());
        }
    }
}
