/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

import java.util.Scanner;

//2.1
public class TV {

    private int channel;    //a
    private int volumeLevel;
    private boolean status;

    public TV() {
        channel = 1;      //b
        volumeLevel = 10;
        status = false;
    }

    public int channelUp() {    //c
        channel = channel + 1;
        if (channel == 12) {
            channel = 1;
        }
        return channel;
    }

    public int channelDown() {
        channel = this.channel - 1;
        if (channel == 0) {
            channel = 11;
        }
        return channel;
    }

    public int volumeUp() {
        if (volumeLevel < 100) {
            volumeLevel = volumeLevel + 1;
            return volumeLevel;
        } else {
            return volumeLevel;
        }
    }

    public int volumeDown() {
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;

        }
        if (volumeLevel == 0) {
            System.out.println("TV MUTE");
        }
        return volumeLevel;

    }

    public void tvOn() {
        status = true;
    }

    public void tvOff() {
        status = false;
    }

    //2.2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //a
        TV control = new TV();
        String command = null;
        do {
            command = input.next();
        } while (!(command.equalsIgnoreCase("ST")));

        do {            //b

            switch (command) {  // c
                case "ST":
                    if (control.status == false) {
                        control.tvOn();
                        System.out.println("TV ON"
                                + "\nVolume: " + control.volumeLevel + "%"
                                + "\nChannel: " + control.channel);
                    } else {
                        control.tvOff();
                    }
                    break;
                case "VU":

                    System.out.println("Volume: " + control.volumeUp());
                    break;
                case "VD":

                    System.out.println("Volume: " + control.volumeDown());
                    break;
                case "CU":

                    System.out.println("Channel: " + control.channelUp());
                    break;
                case "CD":

                    System.out.println("Channel: " + control.channelDown());
                    break;
                default:
                    System.out.println("Invalid command");
            }

            if (control.status == true) {
                System.out.println("\nEnter Command");
                command = input.next();
            }

        } while (control.status == true);
    }

}
