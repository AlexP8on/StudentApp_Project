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

            // Populating first student using setters
            System.out.print("Enter student name: ");
            student1.setName(scanner.nextLine());
            System.out.print("Enter student email: ");
            student1.setEmail(scanner.nextLine());
            System.out.print("Enter student course: ");
            student1.setCourse(scanner.nextLine());
        }
}