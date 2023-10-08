/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggameapp;

/**
 * GuessingGame.java
 * 29/05/2023
 * @author Michael E.
 */
public class GuessingGame {
    //Variables or data members in instantiable class should be private
    private StringBuffer strBuff;
    private String secretSentence;
    private char guess;
    private String output;

    public GuessingGame() {
        strBuff = new StringBuffer("*******************");
        secretSentence = "patience is the key";
        output = "";
        guess = ' ';//Must have space between quotes when initializing an empty variable which is a char
    }
    
    //Setters are created for data members in which we receive the values from the app class user inputs
    public void setGuess(char guess) {
        this.guess = guess;
    }
    
    //Getters are created for data members' values which will be sent to the app class
    public String getSecretSentence() {
        return secretSentence;
    }

    public String getOutput() {
        return output;
    }
    
    public void compute(){
        for(int i=0; i<secretSentence.length(); i++){
            if(guess == secretSentence.charAt(i)){
                strBuff.setCharAt(i, guess);
            }
        }
        output = strBuff.toString();//"toString" method is used to convert StringBuffer into String
    }
}
