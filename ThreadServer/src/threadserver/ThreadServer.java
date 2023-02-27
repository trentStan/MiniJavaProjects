/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadserver;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author user-pc
 */
public class ThreadServer {

    static int clientCount;

    public ThreadServer() throws IOException {

        ServerSocket server = new ServerSocket(90);
        while (true) {
            System.out.println("Client Count: " + clientCount );
            clientCount++;
            Socket soc = server.accept();
            WorkTask task = new WorkTask(soc);
            Thread t1 = new Thread(task);
            t1.start();
        }

    }

    public static void main(String[] args) throws IOException {
        new ThreadServer();
    }

}
