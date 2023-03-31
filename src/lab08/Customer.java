/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

import java.util.ArrayList;

/**
 *
 * @author misterfocusth
 */
public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList();
    }

    public Account getAccount(int index) {
        return this.acct.get(index);
    }

    public void addAcount(Account acct) {
        this.acct.add(acct);
        numOfAccount += 1;
    }

    public int getNumOfAccount() {
        return this.acct.size();
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
