/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;

import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class CellClient {

    public void captureDetails() throws IOException {

        sendToServer(new Cell(
                JOptionPane.showInputDialog("Enter manufacturer"),
                JOptionPane.showInputDialog("Enter Model Number"),
                Integer.parseInt(JOptionPane.showInputDialog("Enter retail price"))
        ));
    }

    public void sendToServer(Cell cell) throws IOException {
        Socket soc = new Socket("localhost", 8090);
        ObjectInputStream fromServer = new ObjectInputStream(soc.getInputStream());
        ObjectOutputStream toServer = new ObjectOutputStream(soc.getOutputStream());
        
        toServer.writeObject(cell);
       
    }

    public static void main(String[] args) throws IOException {
        new CellClient().captureDetails();
    }

}
