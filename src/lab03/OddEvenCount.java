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
public class OddEvenCount {

    public static void main(String[] args) {
        int oddCount = 0, evenCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int newNum = scanner.nextInt();

            if (newNum < 0) {
                break;
            }

            if (newNum % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }

        System.out.println("Odd number = " + oddCount + " and Even number = " + evenCount);

    }

}
