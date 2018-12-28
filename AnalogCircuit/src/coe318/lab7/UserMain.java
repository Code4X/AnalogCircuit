/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Kalp
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserMain { 
    private static int fir, sec;
    private static double value;
   
    public static void main (String [] args) {
     
    Scanner input = new Scanner(System.in);
   
    AnalogCircuit p = AnalogCircuit.getInstance();

    String line = "";
           
    while (input != null){
        line = input.nextLine();       
        String arr [] = line.split(" ");
        if (arr.length > 4){
            line = "";
           throw new IllegalArgumentException("Invalid entry, enter the type 'v' or 'r' followed by nodes and value, each separated by a space.");
        }
        if (line.equals("spice"))
            System.out.println(p.toString());
        if (line.startsWith("v")) {
            fir = Integer.parseInt(arr[1]);
            sec = Integer.parseInt(arr[2]);
            value = Double.parseDouble(arr[3]);
            Voltage f = new Voltage (fir, sec, value);
            p.addVoltage(f);
         }
         if (line.startsWith("r")) {
            fir = Integer.parseInt(arr[1]);
            sec = Integer.parseInt(arr[2]);
            value = Double.parseDouble(arr[3]);
             Resistor r = new Resistor(fir, sec, value);
             p.add(r);
          }
          if (line.equals("end"))
             break;
    }
   System.out.println("All Done!");
    }
}
