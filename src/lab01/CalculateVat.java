/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author misterfocusth
 */
public class CalculateVat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basePrice = scanner.nextDouble();
        System.out.println(basePrice + (basePrice * 0.07));
    }

}
