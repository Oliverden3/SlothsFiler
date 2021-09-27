package com.company;

public class Main {


    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Egon");
        BankAccount a2 = new BankAccount("Benny");
        BankAccount a3 = new BankAccount("Kjeld");
        a1.doTransaction(-500);
        printAccount(a3);
        printAccount(a2);
        printAccount(a1);

    }
    public static void printAccount(BankAccount account){
        System.out.println(account);


    }
}
