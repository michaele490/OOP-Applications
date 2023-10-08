/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 * Game.java
 * 20/06/2023
 * @author Michael E.
 */
public abstract class Game {
    protected String input, output;
    
    public void setInput(String input){
        this.input = input;
    }
    
    public void output(){
        System.out.println(output);
    }
    
    //Abstract methods
    public abstract void initialise();
    public abstract void instructions();
    public abstract void checkGuess();
    
    //Template method
    public final void play(String input){
        initialise();
        instructions();
        setInput(input);
        checkGuess();
        output();
    }
}
