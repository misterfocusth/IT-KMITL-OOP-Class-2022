/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author misterfocusth
 */
public class Main {

    public static void main(String[] args) {
        for (int j = -10; j <= 10; j -= 10) {
            System.out.println(j);
        }

        for (int x = -1; x < 5; x++) {
            System.out.print(x + " ");
        }

        System.out.println("");

        for (int x = -10; x < 10; x += 2) {
            System.out.print("X: " + x + " ");
            System.out.print("Y: " + (2 + 3 * x) + " ");
        }

        System.out.println("");

        for (int a = 1; a < 70 && a > -70; a *= -2) {
            System.out.print(a + " ");
        }

        System.out.println("");

        for (int a = 1; a <= 10; a++) {
            if (a % 2 == 0) {
                System.out.print("A ");
            } else {
                System.out.print("B ");
            }
        }

        System.out.println("");
    }

}
