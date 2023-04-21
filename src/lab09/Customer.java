/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

import java.util.ArrayList;

/**
 *
 * @author misterfocusth
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account acct;
    private int numOfAccount;

    public Customer() {
        this("", "", null);
    }

    public Customer(String firstName, String lastName, Account acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public Account getAcct() {
        return acct;
    }

    public void setAcct(Account acct) {
        this.acct = acct;
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public void setNumOfAccount(int numOfAccount) {
        this.numOfAccount = numOfAccount;
    }

    public Account getAccount() {
        return this.acct;
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

    public String toString() {
        if (acct == null) {
            return this.firstName + " " + this.lastName + " doesn’t have account.";
        } else {
            return this.firstName + " " + this.lastName + " has " + this.numOfAccount + " Account(s)";
        }
    }

    public boolean equals(lab07.Customer c) {
        return c.getFirstName().equals(this.firstName) && c.getLastName().equals(this.lastName);
    }
}
