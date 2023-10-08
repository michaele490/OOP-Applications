/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 * EmployeeUI.java
 * 25/06/2023
 * @author Michael E.
 */
import javax.swing.JOptionPane;

public class EmployeeUI {

    private Employee employees[];
    int count;

    public EmployeeUI() {
        employees = new Employee[5];
        count = 0;
    }

    public void add() {
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Type '1' if you want to add a manager, type '2' if you want to add a floorstaff"));
        if (type == 1) {
            Manager m = new Manager();
            m.setName(JOptionPane.showInputDialog("Enter name"));
            m.setDob(JOptionPane.showInputDialog("Enter DOB"));
            m.setId(JOptionPane.showInputDialog("Enter ID"));
            m.setSalary(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter salary")));

            employees[count] = m;
            count++;
        } else if (type == 2) {
            FloorStaff f = new FloorStaff();
            f.setName(JOptionPane.showInputDialog("Enter name"));
            f.setDob(JOptionPane.showInputDialog("Enter DOB"));
            f.setId(JOptionPane.showInputDialog("Enter ID"));
            f.setHourlyRate(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hourly rate\n(Make sure to enter as digits and not letters)")));
            f.setHours(Double.parseDouble(JOptionPane.showInputDialog(null, "Enters hours worked per week\n(Make sure to enter as digits and not letters)")));

            employees[count] = f;
            count++;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input\nEnter either '1' or '2'\nMake sure to enter as digits and not alphabetic values");
        }
    }
    
    public void print(){
        /*for(int i=0; i < count; i++){
            Employee e = employees[i];
            if(e instanceof Manager){
                JOptionPane.showMessageDialog(null, "Name: "+e.getName()+"\nDOB: "+e.getDob()+"\nID: "+e.getId()+"\nSalary: "+((Manager) e).getSalary());
            } else if(e instanceof FloorStaff){
                JOptionPane.showMessageDialog(null, "Name: "+e.getName()+"\nDOB: "+e.getDob()+"\nID: "+e.getId()+"\nSalary: "+((FloorStaff) e).getHours()+((FloorStaff) e).getHourlyRate());
            }
        }*/
        for(int i=0; i<count; i++){
            Employee e = employees[i];
            e.computeWPay();
            JOptionPane.showMessageDialog(null, e.getDetails());
        }
    }
    
    public void search(){
        if(count == 0){
            JOptionPane.showMessageDialog(null, "Sorry, there are no employees to search for");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter an ID to search for");
            for(int i=0; i<count; i++){
                if(employees[i].getId().equals(searchTerm)){
                    JOptionPane.showMessageDialog(null, employees[i].getDetails());
                }
            }
        }
    }
    
    public void delete(){
        if(count == 0){
            JOptionPane.showMessageDialog(null, "There are no employee details to be deleted");
        }
        else{
            String deleteId = JOptionPane.showInputDialog(null, "Enter the ID of the employee you wish to delete");
            for(int  i=0; i<count; i++){
                if(employees[i].getId().equals(deleteId)){
                    //What happens below is the last object in the array overwrites the object which is being deleted
                    //Still a little confusing, will have to look further in to this
                    employees[i] = employees[count - 1];
                    count--;
                }
            }
        }
    }
    
    public void menu(){
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n2. Display \n3.Search \n4. Delete"));
        switch(answer){
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
}
