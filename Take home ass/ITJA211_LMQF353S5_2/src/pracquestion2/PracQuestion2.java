/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracquestion2;

import java.awt.HeadlessException;
import java.util.ArrayList;
;

/**
 *
 * @author user-pc
 */
public class PracQuestion2 {

    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> differentList;
    
    public PracQuestion2() {
        list.add(25);
        list.add(50);
        list.add(75);
        list.add(100);
        list.add(125);
        
        System.out.println("InitialArrayList:");
        for(int count = 0; count < list.size(); count++){
            System.out.println(list.get(count));
        }
        
        list.remove(2);
        list.add(2, 45);
        
        System.out.println("ArrayList after replacement:");
        for(int count = 0; count < list.size(); count++){
            System.out.println(list.get(count));
        }
    }
    
    public static void main(String[] args) {
        new PracQuestion2();
    }
    
}
