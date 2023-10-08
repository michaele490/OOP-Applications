/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countingapp;

/**
 * Counting.java
 * 26/05/2023
 * @author Michael E.
 */
public class Counting {
    private String input;
    private int cons, vows, space;

    public Counting() {
        input = "";
        cons = 0;
        vows = 0;
        space = 0;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getCons() {
        return cons;
    }

    public int getVows() {
        return vows;
    }

    public int getSpace() {
        return space;
    }
    
    public void compute(){
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                vows++;
            }
            else if(input.charAt(i) == ' '){
                space++;
            }
            else{
                cons++;
            }
        }
    }
}
