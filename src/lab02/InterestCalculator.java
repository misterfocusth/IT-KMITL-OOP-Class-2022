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
public class InterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your money: ");
        double savingMoney = scanner.nextDouble();

        System.out.print("Input your account type (Please type A B C or C in Uppercase) : ");
        char accountType = scanner.next().charAt(0);

        double sum = 0.0;

        switch (accountType) {
            case 'A':
                sum = savingMoney * 101.5 / 100;
                break;
            case 'B':
                sum = savingMoney * 102 / 100;
                break;
            case 'C':
                sum = savingMoney * 101.5 / 100;
                break;
            case 'X':
                sum = savingMoney * 105 / 100;
                break;
        }

        System.out.println("Your total money in one year = " + sum);

    }

}
