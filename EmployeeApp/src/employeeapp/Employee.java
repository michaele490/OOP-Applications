/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

import java.io.Serializable;

/**
 * Employee.java
 * 31/05/2023
 * @author Michael E.
 */
public abstract class Employee implements Serializable{
    protected String name, id, dob;

    public Employee() {
        name = " ";
        id = " ";
        dob = " ";
    }

    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String printTest(){
        return "Test to see if I can print directly from a compute method";
    }//Yes I can it worked
    
    public abstract void computeWPay();
    public abstract String getDetails();
}
