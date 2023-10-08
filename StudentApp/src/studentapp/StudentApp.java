/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;

/**
 * StudentApp.java
 * 31/05/2023
 * @author Michael E.
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1;
        s1 = new Student();
        
        s1.setName("Michael");
        s1.setId("12345");
        
        System.out.println("Name: "+s1.getName()+"\nID: "+s1.getId());//If you forget even one '+' print statement will not work
        
        //With overloaded constructor we can initialize values within parenthesis when initializing an instance
        Student s2 = new Student("Yusuf", "6236");
        System.out.println("Name: "+s2.getName()+"\nID: "+s2.getId());
        
        Student s3 = new Student("Abi", "999");
        int grade = s3.compute(88, 66);//We can also use overloaded methods in the app class the same way we use overloaded constructors
        
        System.out.println("Name: "+s3.getName()+"\nID: "+s3.getId()+"\nGrade: "+grade);
        
        Student s4 = new Student("Trinity", "666");
        double gradeDouble = s4.computeGrade(95.5, 76.4);
        System.out.println("Name: "+s4.getName()+"\nID: "+s4.getId()+"\nGrade: "+gradeDouble);
        
    }
    
}
