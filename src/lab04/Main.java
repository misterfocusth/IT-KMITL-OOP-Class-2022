/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author misterfocusth
 */
public class Main {

    public static void main(String[] args) {
//        Fraction f1 = new Fraction();
//        f1.topN = 1;
//        f1.btmN = 3;
//
//        Fraction f2 = new Fraction();
//        f2.topN = 4;
//        f2.btmN = 16;
//
//        Fraction f3 = new Fraction();
//        f3.topN = 5;
//        f3.btmN = 15;
//
//        System.out.println(f1.toFloat());
//        System.out.println(f2.toFloat());
//        System.out.println(f3.toFloat());
//
//        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
//        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
//
//        System.out.println("Before : " + f2.toFraction());
//        f2.LowestTermFrac();
//        System.out.println("After : " + f2.toFraction());

        Cat c = new Cat();
        c.defineCat("Mew", "White");
        c.speak();

        c.upWeight(5);
        c.upHeight(10);
        c.speak();

        c.upWeight(-5);
        c.upHeight(-10);
        c.speak();
    }
}
