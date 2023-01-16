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
public class AverageScore {

    public static void main(String[] args) {
        int x, y, z;

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        double average = (x + y + z) / 3;

        System.out.println(average);

    }

}
