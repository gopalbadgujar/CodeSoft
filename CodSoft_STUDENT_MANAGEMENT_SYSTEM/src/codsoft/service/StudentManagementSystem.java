package codsoft.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import codsoft.model.Student;

/*
 * Implement a StudentManagementSystem class to manage the collection of students. 
 * Include methods to add, remove, search for a student, and display all students.
 */
public class StudentManagementSystem {
	Scanner scanner = new Scanner(System.in);

	private List<Student> students = new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(String rollNumber) {
		students.removeIf(student -> student.getRollNumber().equals(rollNumber));
	}
	

	public Student searchStudent(String rollNumber) {
		for (Student student : students) {
			if (student.getRollNumber().equals(rollNumber)) {
				return student;
			}
		}
		return null;
	}

	public void displayAllStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	/*
	 * Implement methods to read and write student data to a storage medium, such as
	 * a file or a database.
	 */
	public void saveStudentsToFile(String filename) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			for (Student student : students) {
				writer.println(student.getName() + "," + student.getRollNumber() + "," + student.getGrade());
			}
		} catch (IOException e) {
			System.out.println("Error Saving Students to file : " + e.getMessage());
		}
	}

	public void loadStudentsFromFile(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 3) {
					String name = parts[0];
					String rollNumber = parts[1];
					String grade = parts[2];
					Student student = new Student(name, rollNumber, grade);
					students.add(student);
					System.out.println("Students loaded from file Successfully!!!");
				}
			}
		} catch (IOException e) {
			System.out.println("Error loading Students from file : " + e.getMessage());
		}
	}
}