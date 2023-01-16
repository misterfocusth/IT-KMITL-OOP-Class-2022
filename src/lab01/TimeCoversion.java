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
public class TimeCoversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int mins = scanner.nextInt();

        int hoursSeconds = hours * 60 * 60;
        int minsSeconds = mins * 60;

        System.out.println(hoursSeconds + minsSeconds);

    }

}
