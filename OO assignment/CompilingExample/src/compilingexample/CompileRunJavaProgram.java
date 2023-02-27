/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilingexample;

/**
 *
 * @author Stanlee
 */
import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;

public class CompileRunJavaProgram {

    public static void main(String[] args) {
     try {
            
            System.out.println("**********");
            runProcess("javac -cp src src/com/journaldev/files/test.java");
            System.out.println("**********");
            runProcess("java -cp src com/journaldev/files/test Hi Pankaj");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private static void printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(ins));
        while ((line = in.readLine()) != null) {
            System.out.println(cmd + " " + line);
        }
      }

      private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        printLines(command + " stdout:", pro.getInputStream());
        printLines(command + " stderr:", pro.getErrorStream());
        pro.waitFor();
        System.out.println(command + " exitValue() " + pro.exitValue());
      }
      
     
}
