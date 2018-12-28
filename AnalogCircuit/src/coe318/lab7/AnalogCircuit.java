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
public class AnalogCircuit {
    //sets ArrayList and instance variables 
   private ArrayList<Object> circuit = new ArrayList<Object> ();
   private static String arrayString;
   private static AnalogCircuit instance = null;
   public static String voltString;
   
   //makes a new Circuit if there isn't one existing
   public static AnalogCircuit getInstance() {
        if (instance == null) {
        instance = new AnalogCircuit();
        }
    return instance;
   }
  
    private AnalogCircuit(){
    }
   
    //adds a resistor to the ArrayList
    public void add( Resistor r) {
        circuit.add(r);
    }
    //adds a voltage source to the ArrayList
    public void addVoltage (Voltage v) {
        circuit.add(v);
    }

    //returns the Resistor(s) characteristics for the Circuit
    @Override
    public String toString(){
        arrayString= "";
            
        for (int x = 0; x < circuit.size(); x++)
        {
            arrayString = arrayString + (circuit.get(x).toString() + "\n");
        }
       
        return (arrayString);
        }

    
}
