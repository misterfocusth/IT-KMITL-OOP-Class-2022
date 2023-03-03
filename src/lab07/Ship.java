/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author misterfocusth
 */
public class Ship extends Vehicle implements Floatable {

    public Ship() {
        this(0.0);
    }

    public Ship(double fuel) {
        super(fuel);
    }

    public void move() {
        this.fl0at();
    }

    public void move(int distance) {
        for (int x = 0; x < distance; x++) {
            this.fl0at();
        }
    }

    @Override
    public void fl0at() {
        if (this.getFuel() >= 50) {
            this.setFuel(this.getFuel() - 50);
            System.out.println("Ship moves");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }

    @Override
    public void startEngine() {
        if (this.getFuel() >= 10) {
            this.setFuel(this.getFuel() - 10);
            System.out.println("Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }

}
