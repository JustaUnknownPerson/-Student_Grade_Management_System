/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grades;

/**
 *
 * @author unknown
 */
public class Student_Util {
    
    void addStudent(String student, double grade) { 
        Student_Grade_Management_System.students.add(student);
        Student_Grade_Management_System.grades.add(grade);
    }
    
    void viewAllStudents() {
        if (Student_Grade_Management_System.students.isEmpty()) { 
            System.out.println("There are no Student to show.\n");
            return;
        } 
        System.out.println("Student Lists: ");
        for (int i = 0; i < Student_Grade_Management_System.students.size(); i++) { 
            System.out.println((i + 1) + ". " + Student_Grade_Management_System.students.get(i) + " - Grade: " + Student_Grade_Management_System.grades.get(i));
        }
        System.out.println("");
    }
    
    void showAverage() {
        int average = 0;
        
        if (Student_Grade_Management_System.grades.isEmpty()) { 
            System.out.println("No Grade to show.\n");
            return;
        }     
        for (double grade : Student_Grade_Management_System.grades) {
            average += grade;
        }
        average /= Student_Grade_Management_System.grades.size();
        System.out.println("Average Grade: " + (double)average);
        System.out.println("");
    }
    
    void showHighLowGrades() { 
        if (Student_Grade_Management_System.grades.isEmpty()) { 
            System.out.println("No grades to show.");
            return;
        }
        
        double highGrade = Student_Grade_Management_System.grades.get(0);
        double lowGrade = Student_Grade_Management_System.grades.get(0);
        String nameHigh = null;
        String nameLow = null;
        
        for (int i = 0; i < Student_Grade_Management_System.grades.size(); i++) { 
            if (Student_Grade_Management_System.grades.get(i) > highGrade) {
                highGrade = Student_Grade_Management_System.grades.get(i);
                nameHigh = Student_Grade_Management_System.students.get(i);
            }
            if (Student_Grade_Management_System.grades.get(i) < lowGrade) { 
                lowGrade = Student_Grade_Management_System.grades.get(i);
                nameLow = Student_Grade_Management_System.students.get(i);
            }
        }
        System.out.println("Highest Grade: " + highGrade + " by " + nameHigh);
        System.out.println("Lowest Grade: " + lowGrade + " by " + nameLow);
        System.out.println("");
    }
}
