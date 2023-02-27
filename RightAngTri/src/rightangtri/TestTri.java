/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rightangtri;

/**
 *
 * @author user-pc
 */
public class TestTri {
    public static void main(String[] args) {
        Thread myThread = new Thread(new RightAngTri());
        Thread myThread1 = new Thread(new RightAngTri());
        myThread.start();
        
        myThread1.start();
        
    }
}
