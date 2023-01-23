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
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your name: ");
        String name = scanner.next();

        System.out.print("Please insert your age: ");
        int age = scanner.nextInt();

        System.out.print("Please insert number of working days: ");
        int workingDays = scanner.nextInt();

        System.out.print("Please insert number of absent days: ");
        int dayoffDays = scanner.nextInt();

        System.out.print("Please insert your body weight: ");
        double weight = scanner.nextDouble();

        double salary = 0.0;
        double bonus = 0.0;

        if (age >= 21 && age <= 30) {
            salary = (workingDays * 300) - (dayoffDays * 50);
        } else if (age >= 31 && age <= 40) {
            salary = (workingDays * 500) - (dayoffDays * 50);
        } else if (age >= 41 && age <= 50) {
            salary = (workingDays * 1000) - (dayoffDays * 25);
        } else if (age >= 51 && age <= 61) {
            salary = (workingDays * 3000);
        }

        if (weight >= 10 && weight <= 60) {
            bonus = 5000;
        } else if (weight >= 61 && weight <= 90) {
            bonus = (5000 - ((weight - 60) * 10));
        }

        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        System.out.println("Your salary and bonus is " + (salary + bonus) + " Baht");
    }

}
