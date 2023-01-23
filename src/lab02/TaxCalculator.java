/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author misterfocusth
 */
public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();
        double tax = 0.0;

        if (salary <= 50000) {
            tax = salary * 0.05;
        } else if (salary > 50000) {
            tax = salary * 0.10;
        }

        System.out.println(tax);
    }
}
