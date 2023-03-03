/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab07;

/**
 *
 * @author misterfocusth
 */
public class Customer {

    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return this.acct;
    }

    public String toString() {
        if (acct == null) {
            return this.firstName + " " + this.lastName + " doesn’t have account.";
        } else {
            return "The " + this.firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }

    public boolean equals(Customer c) {
        return c.getFirstName().equals(this.firstName) && c.getLastName().equals(this.lastName);
    }
}
