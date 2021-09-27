package com.company;

public class BankAccount {

    private float balance = 30000;
    private String owner;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = balance;
    }

    public void doTransaction(float amount) {
        balance += amount;
    }

    public float getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String s;
        s = owner +" : "+balance+"\n";
        return s;
    }
}
