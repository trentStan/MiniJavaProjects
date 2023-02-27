/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursdayconstant;
enum CHOCOLATE{
    LINDT,
    CRUNCHY,
    TOBLERONE,
    KITKAT,
    CHOMP;
    
    private CHOCOLATE(){
        System.out.println("nai");
    }
    
    public void myCode(){
        System.out.println("");
    }
}

public class ThursdayConstant {

    private CHOCOLATE myChoc;

    public ThursdayConstant(CHOCOLATE myChoc) {
        this.myChoc = myChoc;
    }
            
    public void show(){
        System.out.println(myChoc);
    }
    public static void main(String[] args) {
        ThursdayConstant choc = new ThursdayConstant(CHOCOLATE.LINDT);
        choc.show();
        
    }
    
}
