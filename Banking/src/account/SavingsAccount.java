/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;


/**
 *
 * @author LMQF353S5
 */
public class SavingsAccount extends Account{
    
    private double interestRate;
   
   public SavingsAccount(double interestRate, int number, double balance)
   {
       super(number, balance);
       this.interestRate = interestRate;
   }
   
   public void calculateInterest()
   {
       double interest;
       
       interest = getBalance() * (interestRate / 12);
               deposit(interest);
   }
   
   public String toString()
    {
        return "Savings Account -> Number: " + getNumber() + " Interest rate: " + interestRate; 
    }
}

class A extends SavingsAccount
{

    public A(double interestRate, int number, double balance) {
        super(interestRate, number, balance);
    }
    
}

class B extends SavingsAccount
{

    public B(double interestRate, int number, double balance) {
        super(interestRate, number, balance);
    }
    
}

class C extends SavingsAccount
{

    public C(double interestRate, int number, double balance) {
        super(interestRate, number, balance);
    }
    
}