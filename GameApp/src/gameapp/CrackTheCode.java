/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 * CrackTheCode.java
 * 20/06/2023
 * @author Michael E.
 */
public class CrackTheCode extends Game{
    private int secretCode[];
    private int guess;
    
    public CrackTheCode(){
        secretCode = new int[5];
        guess = 0;
    }
    
    @Override
    public void initialise(){
        for(int i=0; i<secretCode.length; i++){
            secretCode[i] = (int)Math.floor(Math.random()*10);
            System.out.println(secretCode[i]);//Just for testing purposes
        }
    }
    
    @Override
    public void instructions(){
        System.out.println("To crack the code please guess a number");
    }
    
    @Override
    public void checkGuess(){
        guess = Integer.parseInt(input);
        for(int i=0; i<secretCode.length; i++){
            if(guess == secretCode[i]){
                output = "Well done, you guessed correctly, that is the number at position "+(i+1)+" in the secret code";
            }
            else{
                output = "Sorry, that isn't correct";
            }
        }
    }
}
