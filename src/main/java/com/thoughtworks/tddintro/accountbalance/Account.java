package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by adobley on 1/3/16.
 */
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int deposit) {
        balance += deposit;
    }

    public int balance() {
        return this.balance;
    }
}
