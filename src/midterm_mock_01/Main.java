/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_mock_01;

/**
 *
 * @author misterfocusth
 */
public class Main {

    public static void main(String[] args) {
        Pigeous p = new Pigeous("Pee", 5);
        Owner bank = new Owner("Bank", p);

        Dog d = new Dog("Qee", 4);
        Owner ice = new Owner("Ice", d);

        Meat m = new Meat();

        System.out.println(bank);
        System.out.println(ice);

        bank.protectOwnerFrom(ice.getAnimal());
        System.out.println(bank);
        System.out.println(ice);

        ice.feedFood(m);
        System.out.println(bank);
        System.out.println(ice);

        p.fly();

        System.out.println("\n");

        Pigeous p1 = new Pigeous("Alex", 8);
        Pigeous p2 = new Pigeous("John", 6);

        System.out.println(p1);
        System.out.println(p2);

        p2.wingAttack(p1, 5);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.fly();
    }
}
