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
public class Voltage {
    //instance variables
    private double volts;
    private int node1, node2;
    private int n1, n2;
    private static int x = 1;
    private int id = 0;
   
    //sets the instance variables
    public Voltage(int node1, int node2, double voltage) {
        this.volts = voltage;
       
        id = x;
        x++;
        n1 = node1;
        n2 = node2;
       
    }
    public int[] getNodes() {
        int nodes[] = new int[2];
        nodes[0] = n1;
        nodes[1] = n2;
        return nodes;
    }
 
    @Override
      //returns the Voltage's characteristics
    public String toString() {
       String result;
       result = "V";
       result = result + id;
       result = result + " " + n1;
       result = result + " " + n2;
       result = result + " DC";
       result = result + " " + volts; 
       return result;
    }  
}