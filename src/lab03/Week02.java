/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author misterfocusth
 */
public class Week02 {

    public static void main(String[] args) {
        questionEight();
        questionNine();
    }

    private static void questionEight() {
        Scanner scanner = new Scanner(System.in);
        int newNum = scanner.nextInt();

        for (int x = 1; x < (newNum + 1); x++) {
            if (x % 5 == 0) {
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }

        System.out.println("");
    }

    private static void questionNine() {
        Scanner scanner = new Scanner(System.in);
        int newNum = scanner.nextInt();

        for (int x = 1; x < (newNum + 1); x++) {
            if (x % 5 == 0) {
                System.out.println("|");
            } else {
                System.out.print("|");
            }
        }

        System.out.println("");
    }
}
