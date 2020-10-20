/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week6;

/**
 *
 * @author 이혜은
 */
public class shoppingcart 
{
    public (int numberOfApple, int numberOforange, double price )
    // Class constructors
    // Called by new. Must have the same name as the class and no return type, not even void.
    {
        this.numberOfApple = numberOfApple;
        this.numberOforange = numberOforange;
        this.price = price;
    }
    // The constructor can be overloaded
    public BankAccount(int accountNumber, String accountName)
    // Class constructor
    // Has the same name as the class and no return type, not even void.
    {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    public BankAccount()
    // A default class constructor has no parameters.
    {
        accountNumber = 9999;
        accountName = "Unknown";
        balance = 0.0;
        
    }

    public void display()
    {
        // A class method has access to the class attributes.
    	System.out.format("Balance for account %d %s is %.2f\n", accountNumber, accountName,balance);
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    // Member attributes
    // The attributes are private so they cannot be accessed outside the class.
    // They are also known as instance variables because each instance or object of this class
    // will have its own copy of these variables.

    private int accountNumber;   // Access modifier is private. Default is public.
    private String accountName;
    private double balance;
    
    
}
