/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Account {

    private int number;
    private double balance = 0;
    private double interestRate;
    private int numTransactions; 
    
    public Account(int number, double balance)
    {
        this.number = number;
        this.balance = balance;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }
    
    public void withdraw(double amount)
    {
        this.balance = this.balance - amount;
    }
    
    public void enterDetails()
    {
        
    }
    public static void main(String[] args) {
        D Dca = new D(10, 2000);
        Dca.withdraw(500);
        JOptionPane.showMessageDialog(null, "Cheque Account balance: " + ca.getBalance());
    }
    
}
