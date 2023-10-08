/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 * Student.java
 * 31/05/2023
 * @author Michael E.
 */
public class Student {
    private String name;
    private String id;//Even if id is only numbers, if a value with numericals is not used for calculations it is not necessary to make an int its datatype
    
    //Default constructor
    public Student() {
        name = " ";
        id = " ";
    }
    
    //Overloaded constructor
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public int compute(int g1, int g2){
        int grade = (g1+g2)/2;
        return grade;
    }
    
    public double computeGrade(double g1, double g2){
        double gradeDouble = (g1+g2)/2;
        return gradeDouble;
    }
}
