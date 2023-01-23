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
public class Week02Recap {

    private static void printOrderList(boolean isSize38, boolean isSize43, boolean isBuyDVDCDWriter, boolean isBuyPrinter) {
        System.out.println("* Computer >> 375.99$");

        if (isSize38) {
            System.out.println("* 38 Monitor >> 75.99$");
        }

        if (isSize43) {
            System.out.println("* 43 Monitor >> 99.99$");
        }

        if (isBuyDVDCDWriter) {
            System.out.println("* DVD/CD Writer >> 65.99$");
        }

        if (isBuyPrinter) {
            System.out.println("* Printer >> 125.00$");
        }
    }

    public static void main(String[] args) {
        final double NORMAL_COMPUTER_PRICE = 375.99;
        final double SIZE_38_ADDITIONAL_PRICE = 75.99;
        final double SIZE_43_ADDITIONAL_PRICE = 99.99;

        final double DVD_CD_WRITER_PRICE = 65.99;
        final double PRINTER_PRICE = 125.00;

        double totalPrice = NORMAL_COMPUTER_PRICE;
        boolean isSize38 = false;
        boolean isSize43 = false;
        boolean isBuyDVDCDWriter = false;
        boolean isBuyPrinter = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert your monitor size 38 or 43 only: ");
        int monitorSize = scanner.nextInt();

        if (monitorSize == 38) {
            isSize38 = true;
            totalPrice += SIZE_38_ADDITIONAL_PRICE;
        } else if (monitorSize == 43) {
            isSize43 = true;
            totalPrice += SIZE_43_ADDITIONAL_PRICE;
        }

        System.out.print("Do you want DVD-ROM? 1 is Yes / 0 is No: ");
        int addDVDROMOption = scanner.nextInt();

        if (addDVDROMOption == 1) {
            isBuyDVDCDWriter = true;
            totalPrice += DVD_CD_WRITER_PRICE;
        }

        System.out.print("Do you want printer? 1 is Yes / 0 is No: ");
        int addPrinterOption = scanner.nextInt();

        if (addPrinterOption == 1) {
            isBuyPrinter = true;
            totalPrice += PRINTER_PRICE;
        }

        System.out.println("\n====== Your Order ======");
        printOrderList(isSize38, isSize43, isBuyDVDCDWriter, isBuyPrinter);

        System.out.println("\n====== Total Price >>> " + totalPrice + " ======");

    }
}
