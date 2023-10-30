package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentAppMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Three instances of Student class
            Student student1 = new Student();
            Student student2;
            Student student3;

            // Populates first student using setters
            System.out.print("Enter student name: ");
            student1.setName(scanner.nextLine());
            System.out.print("Enter student email: ");
            student1.setEmail(scanner.nextLine());
            System.out.print("Enter student course: ");
            student1.setCourse(scanner.nextLine());

            // Populating second student using constructor and setters
            System.out.print("Enter student name: ");
            String name2 = scanner.nextLine();
            System.out.print("Enter student email: ");
            String email2 = scanner.nextLine();
            System.out.print("Enter student course: ");
            String course2 = scanner.nextLine();
            student2 = new Student(name2);
            student2.setEmail(email2);
            student2.setCourse(course2);

            // Populating third student using constructor with parameters
            System.out.print("Enter student name: ");
            String name3 = scanner.nextLine();
            System.out.print("Enter student email: ");
            String email3 = scanner.nextLine();
            System.out.print("Enter student course: ");
            String course3 = scanner.nextLine();
            student3 = new Student(name3, email3, course3);

            //Printing the inputs for each Student
            System.out.println("\nDetails of Student 1:");
            System.out.println("Name: " + student1.getName());
            System.out.println("Email: " + student1.getEmail());
            System.out.println("Course: " + student1.getCourse());

            System.out.println("\nDetails of Student 2:");
            System.out.println("Name: " + student2.getName());
            System.out.println("Email: " + student2.getEmail());
            System.out.println("Course: " + student2.getCourse());

            System.out.println("\nDetails of Student 3:");
            System.out.println("Name: " + student3.getName());
            System.out.println("Email: " + student3.getEmail());
            System.out.println("Course: " + student3.getCourse());

            // Close the scanner
            scanner.close();
        }

}