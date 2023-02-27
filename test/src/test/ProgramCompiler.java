/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.net.URI;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Stanlee
 */
public class ProgramCompiler {
    private static String URLInput;

    public ProgramCompiler(String URLInput) {
        this.URLInput = URLInput;
        websiteOpener();
        FileChooser fc = new FileChooser();
        fc.showSaveDialog(null);
        
    }
    
    public void websiteOpener()
    {
        try{
        URI uri = new URI(URLInput); 
        java.awt.Desktop.getDesktop().browse(uri);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
