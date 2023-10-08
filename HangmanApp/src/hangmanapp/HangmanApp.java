/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangmanapp;

/**
 * HangmanApp.java 31/05/2023
 *
 * @author Michael E.
 */
import javax.swing.JOptionPane;

public class HangmanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String secret, output;
        char guess;

        Hangman h = new Hangman();
        
        //Below is an example of how to decrease the amount of times a finite loop is run from its max depending on whether a certain condition is met 
        boolean correct = false;
        int i = 0;
        while (!correct && i < 10) {
            guess = JOptionPane.showInputDialog(null, "Please enter a letter you guess for the secret word").charAt(0);//We have to use '.charAt(0)' when deriving char from JOptionPane
            h.setGuess(guess);

            h.compute();
            output = h.getOutput();
            JOptionPane.showMessageDialog(null, output);
            if (output.equals("house")) {//Always remember we use .equals to compare Strings
                correct = true;
            }
            i++;//This is necessary
            
        }
        
    }

}
