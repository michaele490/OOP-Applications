/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessmentapp;

/**
 * Essay.java
 * 22/06/2023
 * @author Michael E.
 */
public class Essay extends Assessment{//Don't forget "extends + SuperclassName" this is a common mistake
    private double wordCountPen;

    public Essay() {
        super();
        wordCountPen = 0.0;
    }

    public double getWordCountPen() {
        return wordCountPen;
    }

    public void setWordCountPen(double wordCountPen) {
        this.wordCountPen = wordCountPen;
    }
    
    @Override
    public void calculateGrade(){
        String formattedPercentage = String.format("%.2f", percentage);
        grade = (weighting * (percentage/100))-wordCountPen;
    }
    
    @Override
    public String getDetails(){
        return "Module: "+modName+"\nName: "+name+"\nWeighting: "+weighting+"\nWord Count Penalty: "+wordCountPen+"%\nPercentage: "+(percentage-wordCountPen)+"\nGrade: "+grade;
    }
}
