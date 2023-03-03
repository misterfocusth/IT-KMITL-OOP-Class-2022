/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author misterfocusth
 */
public class Main {

    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(50000, "61070033", 5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw("55000");
        System.out.println(a1.toString());
    }
}
