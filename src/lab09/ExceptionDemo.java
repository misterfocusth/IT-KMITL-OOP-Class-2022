package lab09;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        double numA = 0;
        double numB = 0;
        double numC = 0;

        try {
            numA = Double.parseDouble(args[0]);
            numB = Double.parseDouble(args[1]);
            numC = Double.parseDouble(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("“Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("“Please enter 3 numbers as a, b, and c respectively.");
        }

        double x1_top = (- numB) + Math.sqrt(Math.pow(numB, 2) - (4 * numA * numC));
        double x1_bottom = 2 * numA;
        double x1 = x1_top / x1_bottom;

        double x2_top = (- numB) - Math.sqrt(Math.pow(numB, 2) - (4 * numA * numC));
        double x2_bottom = 2 * numA;
        double x2 = x2_top / x2_bottom;

        System.out.println(x1);
        System.out.println(x2);
    }
}