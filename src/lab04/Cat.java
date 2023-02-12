/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author misterfocusth
 */
public class Cat {

    private String name;
    private String color;
    public double height;
    public double weight;

    private void setWeight(double w) {
        if (w <= 0) {
            System.out.println("Error !");
        } else {
            this.weight = w;
        }
    }

    private void setHeight(double h) {
        if (h <= 0) {
            System.out.println("Error !");
        } else {
            this.height = h;
        }
    }

    private void setName(String n) {
        this.name = n;
    }

    private void setColor(String c) {
        this.color = c;
    }

    public void upWeight(double w) {
        this.setWeight(weight + w);
    }

    public void downWeight(double w) {
        this.setWeight(weight - w);
    }

    public void upHeight(double h) {
        this.setHeight(height + h);
    }

    public void downHeight(double h) {
        this.setHeight(height - h);
    }

    public void defineCat(String n, String c) {
        this.setName(n);
        this.setColor(c);
    }

    public void speak() {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
    }
}
