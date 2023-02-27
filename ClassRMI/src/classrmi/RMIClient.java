/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrmi;


import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class RMIClient {
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Scanner input = new Scanner(System.in);
        String words;
        int[] numbers = new int[7];
        int count = 0;
          System.out.println("Enter numbers");
        while(count < numbers.length){
            numbers[count] = input.nextInt();
            count++;
        }
        System.out.println("Enter Words");
        words = input.nextLine();
        
      
        
        
        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        ReverseAvgInterface stub = (ReverseAvgInterface) reg.lookup("Lino");
        System.out.println("The average is " + stub.avg(numbers));
        System.out.println("The reverse is " + stub.reverse(words));
        
    }
}
