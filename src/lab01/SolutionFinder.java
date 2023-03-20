/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author misterfocusth
 */
public class SolutionFinder {

    public static void main(String[] args) {
        double a = 4;
        double b = 8;
        double c = 3;

        double x1_top = (-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1_bottom = 2 * a;
        double x1 = x1_top / x1_bottom;

        double x2_top = (-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x2_bottom = 2 * a;
        double x2 = x2_top / x2_bottom;

        System.out.println(x1);
        System.out.println(x2);
    }
}
