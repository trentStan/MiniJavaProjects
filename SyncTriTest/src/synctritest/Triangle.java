/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synctritest;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author user-pc
 */
public class Triangle implements Runnable {

    private String type, name;
    private int row, col, height;
    ServerSocket soc ;
    
    public Triangle(String type, int height) throws IOException {
        this.type = type;
        this.height = height;
        name = Thread.currentThread().getName();
        ServerSocket soc = new ServerSocket(90);
    }

    @Override
    public void run() {
        
        synchronized(name)
        {
            if (this.type.equalsIgnoreCase("stars")) {
                printStars();
            } else {
                print0s();
            }
        }
    }

    public void printStars() {
        row = 1;
        while (row <= height) {
            col = 1;
            while (col <= row) {
                System.out.print("*" + " ");
                col++;
            }
            System.out.println("");
            row++;
        }
    }

    private void print0s() {
        row = 1;
        while (row <= height) {
            col = 1;
            while (col <= row) {
                System.out.print("0" + " ");
                col++;
            }
            System.out.println("");
            row++;
        }
    }
}
