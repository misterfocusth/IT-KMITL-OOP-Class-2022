/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author misterfocusth
 */
public class Food {

    private static final int energy = 10;
    private static double price = 50;

    public static void setPrice(double price) {
        if (Food.price > Food.getPrice()) {
            Food.price = price;
        } else {
            System.out.println("Cannot update the food price.");
        }

    }

    public static double getPrice() {
        return Food.price;
    }

    public static int getEnergy() {
        return Food.energy;
    }
}
