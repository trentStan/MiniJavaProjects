 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Inventory {

    Scanner input;
    private String title, author, isbn;
    private double costPrice, sellingPrice;
    private double total = 0;
    DecimalFormat df = new DecimalFormat("##.##");
    
    public static void main(String[] args) throws FileNotFoundException {
       new Inventory();
    }

    public Inventory() throws FileNotFoundException {
        this.input = new Scanner(new File("details.txt"));
        calculatePrice();
        System.out.println("The total is R" + df.format(total));
    }
    
    public void calculatePrice(){
        sellingPrice = (costPrice + (costPrice * 0.2)) * (1.14);
        
        if(){
            
        }
            
        
    }
    
    public void myFile(){
        while(input.hasNext()){
            title = input.next();
            author = input.next();
            isbn = input.next();
            costPrice = Double.parseDouble(input.next());
            calculatePrice();
            total = total + sellingPrice;
        }
    }
}
