/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charintvalue;

/**
 *
 * @author user-pc
 */
public class CharIntValue {

    private char character;

    public void display() {
        for (int count = 0; count < 14; count++) {
            switch (count) {
                case 0:
                    character = 'A';
                    break;
                case 1:
                    character = 'B';
                    break;
                case 2:
                    character = 'C';
                    break;
                case 3:
                    character = 'a';
                    break;
                case 4:
                    character = 'b';
                    break;
                case 5:
                    character = 'c';
                    break;
                case 6:
                    character = '0';
                    break;
                case 7:
                    character = '1';
                    break;
                case 8:
                    character = '2';
                    break;
                case 9:
                    character = '$';
                    break;
                case 10:
                    character = '*';
                    break;
                case 11:
                    character = '+';
                    break;
                case 12:
                    character = '/';
                    break;
                case 13:
                    character = ' ';
                    break;
            }

            System.out.printf("The character %c has the value %d\n", character, ((int) character));
        }
    }

    public static void main(String[] args) {
        CharIntValue charvalue = new CharIntValue();
        charvalue.display();
    }

}
