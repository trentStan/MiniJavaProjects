/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rightangtri;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class RightAngTri implements Runnable {

    private int row,col,heightT = 0; 

    public RightAngTri() {
        
    
    }
   public void run(){
       captureHeight();
        drawTriangle();
       
   }
    
    public void captureHeight(){
        heightT = Integer.parseInt(JOptionPane.showInputDialog("Enter height "));
    }
    
    public void drawTriangle(){
        col = 1;
        
        int space = 1;
        while(col <=heightT){
            row=1;
            while(space < (heightT -col)){
                System.out.print(" ");
            space++;
            }
            space = 1;
            
            while(row<= col){
                System.out.print("*");
                row++;
            }
            System.out.println("");
            col++;
        }
        
    }
    
    
    
}
