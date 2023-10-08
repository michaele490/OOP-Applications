/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingapp;

/**
 * CountingApp.java
 * 26/05/2023
 * @author Michael E.
 */
import javax.swing.JOptionPane;
public class CountingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String experiment;
        int cons, vows, space;
        
        Counting myCounting  = new Counting();
        
        experiment = JOptionPane.showInputDialog(null,"Please enter a sentence");
        myCounting.setInput(experiment);
        
        myCounting.compute();
        
        cons = myCounting.getCons();
        vows = myCounting.getCons();
        space = myCounting.getSpace();
        
        JOptionPane.showMessageDialog(null, "There are "+space+" spaces, "+cons+" consonants, and "+vows+" vows");
    }
    
}
