package com.fdmgroup.Exceptions;

public class BankAccount {
    private double balance;

    public void withdraw(double amount) throws BankAccountException{
        if(amount < 0){
            throw new BankAccountException("Cannot withdraw negative amount");
        }
        balance -= amount;
    }

    public void addFunds(double amount)throws BankAccountException{
        /*String string = null;
        System.out.println(string.length());*/
        if(amount < 0){
            throw new BankAccountException("Cannot add negative amount");
        }
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
