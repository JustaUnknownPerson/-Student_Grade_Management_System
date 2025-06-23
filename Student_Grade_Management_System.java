/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grades;
import java.util.*;
/**
 *
 * @author Amoroso
 */
public class Student_Grade_Management_System {
    static List<String> students = new ArrayList<>();
    static List<Double> grades = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Util student = new Student_Util();
        
        int choice = 0;
        
        do {
            System.out.println("Student Grade Management System");
            System.out.println("1. Add Students");
            System.out.println("2. View All Students");
            System.out.println("3. Show Average Grade");
            System.out.println("4. Show Highest and Lowest Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println("");
                if (choice >= 1 && choice <= 5) { 
                    switch (choice) {
                        case 1:
                            while (true) { 
                                try { 
                                    System.out.print("Enter Student Name:");
                                    String name = scanner.nextLine();
                                    System.out.print("Enter Student Grade:");
                                    double grade = Double.parseDouble(scanner.next());
                                    if (grade >= 0 && grade <= 100) { 
                                        student.addStudent(name, grade);
                                        System.out.println("Student Added Successfully\n");
                                        break;
                                    } else { 
                                        System.out.println("Please input the correct grade that are given to you.");
                                        scanner.nextLine();
                                    }
                                } catch (NumberFormatException e) { 
                                    System.out.println("Enter valid grade.");
                                    scanner.nextLine();
                                }
                            }
                            break;
                        case 2: 
                            student.viewAllStudents();
                            break;
                        case 3: 
                            student.showAverage();
                            break;
                        case 4: 
                            student.showHighLowGrades();
                            break;
                        case 5: 
                            System.out.println("Exiting.......");
                            break;
                        default:
                            System.out.println("Something went wrong.");
                    }
                } else { 
                    System.out.println("Choose only between 1-5.\n");
                }
            } else { 
                System.out.println("Only input a valid integer.\n");
                scanner.nextLine();
            }
        } while (choice != 5);
        
        System.out.println("Thank you for using our Student Grade Management System");
    }
    
}
