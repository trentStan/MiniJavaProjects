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
public class ChequingAccount extends Account{
   
    private int numTransactions;
    
    public ChequingAccount( int number, double balance)
    {
        super(number, balance);
        this.numTransactions = 0;
    }
    
    public String toString()
    {
        
        return super.toString() + " Transaction Count: " + numTransactions;
    }
    public void calculateFees()
    {
        
    }
}

class D extends ChequingAccount
{

    public D( int number, double balance) {
        super( number, balance);
    }
    
}

class E extends ChequingAccount
{

    public E( int number, double balance) {
        super( number, balance);
    }
    
}
