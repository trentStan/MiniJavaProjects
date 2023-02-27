/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepay;

/**
 *
 * @author LMQF353S5
 */
public class EmployeePay {
    
    public double netPay;
    public double bonus;
    public double grossPay;
    
    public double myCalculations()
    {
        netPay = grossPay + bonus;
        return netPay;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
