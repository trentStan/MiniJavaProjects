/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;

import java.awt.Desktop;
import java.io.*;
import java.net.*;

/**
 *
 * @author user-pc
 */
public class CellServer {

    ServerSocket server;
    Socket soc;
    FileWriter myWriter;

    public CellServer() throws IOException, ClassNotFoundException {
        server = new ServerSocket(8090);
        soc = server.accept();
        ObjectInputStream fromClient = new ObjectInputStream(soc.getInputStream());
        ObjectOutputStream toClient = new ObjectOutputStream(soc.getOutputStream());
      
        Cell cell = (Cell) fromClient.readObject(); 
        
        
        System.out.println(cell.manufacturer);
        fromClient.close();
        File cellFile = new File(cell.getModelNumber() + ".txt");
        System.out.println("here");
        if (cellFile.createNewFile()) {
            myWriter = new FileWriter(cellFile.getName());
            myWriter.write("Manufacturer: " + cell.getManufacturer()
                    + "\nModel Number: " + cell.getModelNumber()
                    + "\nRetail Price: " + cell.getRetailPrice());
            myWriter.close();
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().edit(cellFile);
            } 
        } else {
            myWriter = new FileWriter(cellFile.getName());
            myWriter.write("Manufacturer: " + cell.getManufacturer()
                    + "\nModel Number: " + cell.getModelNumber()
                    + "\nRetail Price: " + cell.getRetailPrice());
            myWriter.close();
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().edit(cellFile);
            } 
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new CellServer();
    }
}
