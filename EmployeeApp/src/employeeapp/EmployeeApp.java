/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeapp;

/**
 * EmployeeApp.java
 * 31/05/2023
 * @author Michael E.
 */
import javax.swing.JOptionPane;
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*EmployeeUI myUI = new EmployeeUI();
        String ans;
        do{
            myUI.menu();
            ans = JOptionPane.showInputDialog(null, "Would you like to see the menu again?");
        }
        while(ans.equals("yes"));*/
        
        EmployeeGUI myGUI = new EmployeeGUI();
        myGUI.setVisible(true);
    }
    
}
