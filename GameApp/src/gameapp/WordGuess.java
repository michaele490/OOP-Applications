/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 * WordGuess.java
 * 20/06/2023
 * @author Michael E.
 */
public class WordGuess extends Game{
    private String words[];
    private char guess;
    private String secret;
    
    public WordGuess(String words[]){
        this.words = words;
    }
    
    @Override
    public void initialise(){
        secret = words[(int) Math.floor(Math.random()*10)];
        System.out.println(secret);
    }
    
    @Override
    public void instructions(){
        System.out.println("To play the game please pick a letter");
    }
    
    @Override
    public void checkGuess(){
        guess = input.charAt(0);
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess){
                output = "Well done, you guessed correctly, that is the letter at position "+(i+1)+" in the secret word";
            }
            else{
                output = "Sorry, that guess is in correct you silly little doughnut";
            }
        }
    }

}
