/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine1;

/**
 *
 * @author LMQF353S5
 */
public class Valentine1 {

    private int count = 1;

    public void enterDetails() {

    }

    public void createRandom() {
        for (count = 1; count <= 10; count++) {
            double number = Math.random();
            System.out.println(number);
            if (number > 0.5) {
                count = 1;
                break;

            }
        }
    }

    public static void main(String[] args) {
        Valentine1 valentine1 = new Valentine1();
        valentine1.createRandom();
    }

}
