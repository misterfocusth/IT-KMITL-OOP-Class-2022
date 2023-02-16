/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author misterfocusth
 */
public class Car extends Vehicle {

    private String typeEngine;

    public void setTypeEngine(String t) {
        this.typeEngine = t;
    }

    public String getTypeEngine() {
        return this.typeEngine;
    }

    public void showCarInfo() {
        System.out.println("Car engine is " + this.typeEngine + ".");
        super.showInfo();
    }

    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        this.setTypeEngine(y);
    }

    public void move() {
        if (this.getFuel() < 50) {
            System.out.println("Please add fuel.");
        } else {
            this.setFuel(this.getFuel() - 50);
            System.out.println("Move.");
        }
    }
}
