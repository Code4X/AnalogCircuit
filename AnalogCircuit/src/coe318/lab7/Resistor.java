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
public class Resistor {
    //instance variables
    private double resist;
    private int node1, node2;
    private static int x = 1;
    private int id = 0;
 
   
    //sets the instance variables
    public Resistor(int n1, int n2, double resistance ) {
        this.resist = resistance;
        id = x;
        x++;
        node1 = n1;
        node2 = n2;
    }
   
    public int[] getNodes() {
        int nodes[] = new int[2];
        nodes[0] = node1;
        nodes[1] = node2;
        return nodes;
    }
     
    //returns the Resistor's characteristics
    @Override
    public String toString() {
       String result;
       result = "R";
       result = result + id;
       result = result + " " + node1;
       result = result + " " + node2;
       result = result + " " + resist; 
       return result;
    }  
}