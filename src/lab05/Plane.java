/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author misterfocusth
 */
public class Plane extends Vehicle {

    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is " + this.getFuel() + " litre and Top Speed is " + this.getTopSpeed() + " m/s.");
    }

    public void setPlaneInfo(int s, String t) {
        this.setFuel(s);
        this.setTopSpeed(t);
    }

    public void fly() {
        if (this.getFuel() < 200) {
            System.out.println("Please add fuel.");
        } else {
            this.setFuel(this.getFuel() - 200);
            System.out.println("Fly.");
        }
    }

    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.setPlaneInfo(500, "High");
        p1.showPlaneInfo();
        Car c1 = new Car();
        c1.setCarInfo(500, "High", "Diesel");
        c1.showCarInfo();

        System.out.println("\n\n");

        Plane p2 = new Plane();
        p2.setPlaneInfo(300, "High");
        p2.showPlaneInfo();
        p2.fly();
        p2.showPlaneInfo();
        p2.fly();
        p2.showPlaneInfo();

        System.out.println("\n\n");

        Car c2 = new Car();
        c2.setCarInfo(60, "High", "Diesel");
        c2.showCarInfo();
        c2.move();
        c2.showCarInfo();
        c2.move();
        c2.showCarInfo();
    }
}
