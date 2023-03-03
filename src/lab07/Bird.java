/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author misterfocusth
 */
public abstract class Bird implements Flyable {

    private double wingSize;
    private double weight;
    private double height;

    public Bird() {
        this(0.0, 0.0, 0.0);
    }

    public Bird(double wingSize, double weight, double height) {
        this.wingSize = wingSize;
        this.weight = weight;
        this.height = height;
    }

    public void eat(double food) {
        if (food > 0) {
            this.weight += food;
        } else {
            System.out.println("Input cannot be negative number.");
        }
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    public double getWingSize() {
        return this.wingSize;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
