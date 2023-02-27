/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsql;

import java.io.*;

/**
 *
 * @author user-pc
 */
public class TestSQL{

static FileReader sql;

    public TestSQL() throws FileNotFoundException {
    sql = new FileReader("createDB&Tables.sql");
    }


public static void main(String[] args) throws IOException {
       new TestSQL();
    System.out.println(sql.toString());
    }
    
}
