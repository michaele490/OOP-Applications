/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameapp;

/**
 * GameApp.java
 * 20/06/2023
 * @author Michael E.
 */
import javax.swing.JOptionPane;
public class GameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to play 1.CrackTheCode or 2.WordGuess"));
        if(choice == 1){
            Game game;
            game = new CrackTheCode();
            String input = JOptionPane.showInputDialog(null, "Please enter your first number guess");
            game.play(input);
        }
        else if(choice == 2){
            String words[] = {"house", "apple", "rose", "dog", "banana", "flower", "college", "java", "computer", "code"};
            Game game;
            game = new WordGuess(words);
            String input = JOptionPane.showInputDialog(null, "Please enter your first letter guess");
            game.play(input);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter a valid input which should either be '1' or '2' written as a digit");
        }
    }
    
}
