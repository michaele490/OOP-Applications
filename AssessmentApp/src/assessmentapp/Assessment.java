/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessmentapp;

/**
 * Assessment.java
 * 22/06/2023
 * @author Michael E.
 */
public abstract class Assessment {
    protected String name, modName;
    protected int weighting;
    protected double percentage, grade;

    public Assessment() {
        name = " ";
        modName = " ";
        weighting = 0;
        percentage = 0.0;
        grade = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    //Abstract methods
    public abstract String getDetails();
    public abstract void calculateGrade();
}
