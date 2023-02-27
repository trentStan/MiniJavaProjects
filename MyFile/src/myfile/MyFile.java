/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author LMQF353S5
 */
public class MyFile {

    public static void main(String[] args) throws FileNotFoundException {
       Scanner input = new Scanner(new File("details.txt"));
        
        while(input.hasNext()){
            System.out.println(input.nextLine());
        }
    }

}
