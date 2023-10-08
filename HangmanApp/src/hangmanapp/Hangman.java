/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmanapp;

/**
 * Hangman.java
 * 31/05/2023
 * @author Michael E.
 */
public class Hangman {
    private StringBuffer strBuff;//Used for calculations in compute method
    private String secret;//Holds the secret word
    private char guess;//The guessed character from the user
    private String output;//Reveals only the letters guessed correctly by user and what position they are in

    public Hangman() {
        //I think StringBuffer has to be initialized with a value such as the stars below, that's why it didn't initially work in the other app I made prior to this 'GuessingGameApp'
        strBuff = new StringBuffer("*****");//Initializing an empty StringBuffer is similiar to initializing an instance
        secret = "house";
        guess = ' ';//Has to be space inbetween qoutes when initializing empty char
        output = " ";
    }

    public void setGuess(char guess) {
        this.guess = guess;
    }

    public String getSecret() {
        return secret;
    }

    public String getOutput() {
        return output;
    }
    
    public void compute(){
        for(int i=0; i<secret.length(); i++){
            if(guess == secret.charAt(i)){//The 'charAt' method is used to get the value at i
                strBuff.setCharAt(i, guess);//To assign char to strBuff we use 'setCharAt' method and then in parenthesis we do as shown
            }
        }
        output = strBuff.toString();
    }
    
}
