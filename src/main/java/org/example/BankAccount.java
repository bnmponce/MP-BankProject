package org.example;

import java.util.Scanner;

public class BankAccount {
    private final String own;
    private final String accountNumber;
    private double total;

    public BankAccount(String own, String accountNumber){
        this.own=own;
        this.accountNumber=accountNumber;
        this.total = 1000;
    }
    public void withdraw(Scanner scanner){
        int amount;
        System.out.print("Insert the amount do you want to withdraw: ");
        amount=scanner.nextInt();
        if (amount <=this.total){
            this.total = this.total-amount;
            System.out.println("Starting the withdraw ...");
            System.out.println("please withdraw your cash");
            System.out.println("Your balance is: "+ this.total);
        }
        else{
            System.out.print("insufficient balance");
        }
    }

}
