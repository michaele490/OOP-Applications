/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assessmentapp;

/**
 * AssessmentApp.java 22/06/2023
 *
 * @author Michael E.
 */
import javax.swing.JOptionPane;

public class AssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Main problem with this application is that I couldn't find a way to round the decimals for the percentage and grade to 2 places but other than that it's fine
        String name, modName;
        int weighting, numQuestions;
        double percentage, grade, wordCountPen;

        int decider = Integer.parseInt(JOptionPane.showInputDialog("Please select whether the assessment is a quiz or an essay\nType '1' for a quiz and '2' for an essay"));

        if (decider == 1) {
            Quiz q = new Quiz();
            //User inputs below
            modName = JOptionPane.showInputDialog(null, "What is the name of the module?");
            name = JOptionPane.showInputDialog(null, "What is the name of the assessment?");
            weighting = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the weighting of this assessment in the overall grade?\n(Please write answer as digit and not letters)"));
            percentage = Double.parseDouble(JOptionPane.showInputDialog("What percentage did the student get in the quiz (Please write answers as digits instead of letters)"));
            numQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "How many questions are in this quiz?"));
            //Assigning these values to the ones in the instantiable classes below
            q.setModName(modName);
            q.setName(name);
            q.setWeighting(weighting);
            q.setPercentage(percentage);
            q.setNumQuestions(numQuestions);

            q.calculateGrade();
            q.getGrade();
            JOptionPane.showMessageDialog(null, q.getDetails());
        } else if (decider == 2) {
            Essay e = new Essay();
            
            modName = JOptionPane.showInputDialog(null, "What is the name of the module?");
            name = JOptionPane.showInputDialog(null, "What is the name of the assessment?");
            weighting = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the weighting of this assessment in the overall grade?\n(Please write answer as digit and not letters)"));
            percentage = Double.parseDouble(JOptionPane.showInputDialog("What percentage did the student get in the quiz (Please write answers as digits instead of letters)"));
            wordCountPen = Integer.parseInt(JOptionPane.showInputDialog(null, "If the student exceeded the maximum amount of words type in the percent taken off the assessment as digits, for example '10' not 'ten'"));
            
            e.setModName(modName); e.setName(name); e.setWeighting(weighting); e.setPercentage(percentage); e.setWordCountPen(wordCountPen);
            
            e.calculateGrade();
            e.getGrade();
            JOptionPane.showMessageDialog(null, e.getDetails());
        }
    }

}
