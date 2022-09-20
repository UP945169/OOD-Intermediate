package com.fdmgroup.Exceptions;


public class Runner {
    public static void main(String[] args) {
        runCode();
    }
    public static void runCode(){
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.addFunds(-100);
            System.out.println("Funds added successfully");
        } catch (BankAccountException e) {
            System.out.println("Failed here");
            throw new RuntimeException(e);
        }finally {
            System.out.println("Running code in finally block");
        }

        System.out.println("Balance is " + bankAccount.getBalance());
    }
}
