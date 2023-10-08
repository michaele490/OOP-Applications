/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 * FloorStaff.java
 * 31/05/2023
 * @author Michael E.
 */
public class FloorStaff extends Employee{
    private double hourlyRate;
    private double hours;
    private double weeklyPay;

    public FloorStaff() {
        super();
        hourlyRate = 0.0;
        hours = 0.0;
    }

    public FloorStaff(double hourlyRate, double hours, String name, String id, String dob) {
        super(name, id, dob);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public void computeWPay(){
        weeklyPay = hours * hourlyRate;
    }
    
    public double getWeeklyPay(){
        return weeklyPay;
    }
    
    @Override
    public String getDetails(){
        return "Name: "+name+"\nID: "+id+"\nDOB: "+dob+"\nHourly Rate: "+hourlyRate+"\nHours: "+hours+"\nWeekly Pay: "+weeklyPay;
    }
}
