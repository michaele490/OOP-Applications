/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessmentapp;

/**
 * Quiz.java
 * 22/06/2023
 * @author Michael E.
 */
public class Quiz extends Assessment{
    private int numQuestions;

    public Quiz() {
        super();
        numQuestions = 0;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }
    
    @Override
    public void calculateGrade(){
        String formattedPercentage = String.format("%.2f", percentage);
        grade = weighting * (percentage/100);
    }
    
    @Override
    public String getDetails(){
        return "Module: "+modName+"\nName: "+name+"\nWeighting: "+weighting+"%\nQuestions: "+numQuestions+"\nPercentage: "+percentage+"%\nGrade: "+grade+"%";
    }
}
