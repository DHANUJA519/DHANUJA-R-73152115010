package com.day;
class BankAccount {
   double balance;

   BankAccount(double balance) {
       this.balance = balance;
   }

   void deposit(double amount) {
       balance += amount;
   }

   void withdraw(double amount) {
       balance -= amount;
   }
}

class SavingsAccount extends BankAccount {
   SavingsAccount(double balance) {
       super(balance);
   }

   void withdraw(double amount) {
       if (balance - amount < 100) {
           System.out.println("Withdrawal denied: Balance can't fall below $100");
       } else {
           super.withdraw(amount);
           System.out.println("Withdrawal successful: New balance is $" + balance);
       }
   }
}

public class Bank {
   public static void main(String[] args) {
       SavingsAccount savings = new SavingsAccount(500);
       savings.withdraw(450); 
       savings.withdraw(100); 
   }
}
