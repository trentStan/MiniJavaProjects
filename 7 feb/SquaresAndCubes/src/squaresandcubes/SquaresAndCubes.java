/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaresandcubes;

/**
 *
 * @author user-pc
 */
public class SquaresAndCubes {

    public void Display(){
        System.out.println("number  square  cube");
        for(int count = 0; count <= 10; count++){
            System.out.printf("%d%8d%11d\n", count, square(count), cube(count));
        }
    }
    
    public int square(int number){
        return (int) Math.pow(number, 2);
    }
    
    public int cube(int number){
        return (int) Math.pow(number, 3);
    }
    public static void main(String[] args) {
        SquaresAndCubes sc = new SquaresAndCubes();
        sc.Display();
    }
    
}
