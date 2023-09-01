package codsoft.controller;

import java.util.Scanner;

public class MainStudentApp {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 * Design the user interface for the Student Management System. This can be a
		 * console-based interface.
		 */

		while (true) {
			System.out.println("\n           OPTIONS : ");
			System.out.println("-----------------------------------------------------");
			System.out.println("|       1. ADDING A NEW STUDENT -                |");
			System.out.println("|       2. DISPLAY ALL STUDENTS INFORMATION -    |");
			System.out.println("|       3. REMOVING A STUDENT -                  |");
			System.out.println("|       4. SEARCHING FOR A STUDENT -             |");
			System.out.println("|       5. SAVE STUDENTS TO FILE -               |");
			System.out.println("|       6. LOAD STUDENTS FROM FILE -             |");
			System.out.println("|       7. EXIT                                  |");
			System.out.println("-----------------------------------------------------");

			/*
			 * Allow users to interact with the Student Management System by providing
			 * options such as adding a new student, editing, searching, displaying, &
			 * exiting the application.
			 */

			System.out.print("Enter Your Choice : ");
			int choice = scanner.nextInt();

		
			switch (choice) {
			case 1:
				StudentMethods.addStudent();
				System.out.println("Student Added Successfully!!!");
				break;

			case 2:
				System.out.println("All Students:");
				StudentMethods.managementSystem.displayAllStudents();
				break;

			case 3:
				StudentMethods.removeStudent();
				System.out.println("Student Removed Successfully!!!");
				break;

			case 4:
				StudentMethods.searchStudent();
				break;

			case 5:
				StudentMethods.saveStudentsToFile();
				break;

			case 6:
				StudentMethods.loadStudentsFromFile();
				break;

			case 7:
				System.out.println("Exiting the Application.");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice.... Please try again.");
			}
		}
	}

}