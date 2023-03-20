/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author misterfocusth
 */
public class Main {

    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account a1 = new Account(5000, "Sommai");
        Account a2 = new Account(3000, "Somchai");
        cust.addAcount(a1);
        cust.addAcount(a2);

        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);

        System.out.println(cust);

        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }

    }
}
