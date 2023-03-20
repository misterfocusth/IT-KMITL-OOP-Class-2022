/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author misterfocusth
 */
public class Programmer extends Employee {

    private int happiness;

    public void coding(String str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
        } else {
            System.out.println("Error Error Error");
        }
        this.setEnergy(this.getEnergy() - 30);
        this.setHappiness(this.getHappiness() - 30);
    }

    public void coding(char str) {
        this.coding(String.valueOf(str));
        double x = (double) 8;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
