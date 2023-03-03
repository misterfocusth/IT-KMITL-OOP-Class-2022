/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author misterfocusth
 */
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }

    }

    public double getCredit() {
        return this.credit;
    }

    public void withdraw(double a) {
        if ((this.balance - a) >= 0) {
            this.setBalance(this.getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + this.credit + ".");
        } else if (((this.balance) - a) + this.credit >= 0) {
            this.credit = (this.balance + credit) - a;
            this.balance = 0;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + this.credit + ".");
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    public String toString() {
        return "The " + this.name + " account has " + this.balance + " baht and " + this.credit + " credits.";
    }
}
