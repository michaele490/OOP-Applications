/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessinggameapp;

/**
 * GuessingGameApp.java
 * 29/05/2023
 * @author Michael E.
 */
import javax.swing.JOptionPane;
public class GuessingGameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String secretWord;
        String output;
        char guess;
        //We don't need the strBuff variable because it is only used for calculations in the instantiable class
        
        GuessingGame g = new GuessingGame();
        
        guess = JOptionPane.showInputDialog(null, "Please guess a letter for the secret word").charAt(0);
        g.setGuess(guess);
        
        g.compute();
        
        //Since data members in instantiable class are private we must create variables in the app class with the same names and assign the values found in the instantiable class to these variables first by the compute method and then the get methods
        output = g.getOutput();
        JOptionPane.showMessageDialog(null, output);
    }
    
}
