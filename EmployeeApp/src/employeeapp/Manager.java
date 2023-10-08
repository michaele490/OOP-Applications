/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 * Manager.java
 * 31/05/2023
 * @author Michael E.
 */
public class Manager extends Employee{
    private double salary;
    private double weeklyPay;

    public Manager() {
        super();
        salary = 0.0;
    }

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void computeWPay(){
        weeklyPay = salary/52;
    }
    
    public double getWeeklyPay(){
        return weeklyPay;
    }
    
    @Override
    public String getDetails(){
        return "Name: "+name+"\nID: "+id+"\nDOB: "+dob+"\nSalary: "+salary+"\nWeekly Pay: "+weeklyPay;
    }
}
