package codsoft.controller;

import java.util.Scanner;

import codsoft.model.Student;
import codsoft.service.StudentManagementSystem;

public class StudentMethods {

	static Scanner scanner = new Scanner(System.in);
	static StudentManagementSystem managementSystem = new StudentManagementSystem();

	/*
	 * Implement input validations.
	 */
	public static void loadStudentsFromFile() {
		System.out.print("Enter the filename to load Students from : ");
		String filenameLoad = scanner.nextLine();
		managementSystem.loadStudentsFromFile(filenameLoad);
	}

	public static void saveStudentsToFile() {
		System.out.print("Enter the filename to Save Students to : ");
		String filenameSave = scanner.nextLine();
		managementSystem.saveStudentsToFile(filenameSave);
		System.out.println("Students saved to file Successfully!!!");
	}

	public static void searchStudent() {
		System.out.print("Enter the Roll Number of the Student to Search : ");
		String rollNumber = scanner.nextLine();
		Student searchedStudent = managementSystem.searchStudent(rollNumber);
		if (searchedStudent != null) {
			System.out.println("Student found:");
			System.out.println(searchedStudent);
		} else {
			System.out.println("Student not found.");
		}
	}

	public static void removeStudent() {
		System.out.print("Enter the Roll number of the Student to Remove : ");
		String rollNumber = scanner.nextLine();
		managementSystem.removeStudent(rollNumber);
	}

	public static void addStudent() {
		System.out.print("Enter the Name of the Student : ");
		String name = scanner.nextLine();
		System.out.print("Enter the Roll Number of the Student : ");
		String rollNumber = scanner.nextLine();
		System.out.print("Enter the Grade of the Student : ");
		String grade = scanner.nextLine();
		Student student = new Student(name, rollNumber, grade);
		managementSystem.addStudent(student);
	}
}
