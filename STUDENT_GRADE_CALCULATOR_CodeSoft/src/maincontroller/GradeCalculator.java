package maincontroller;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of subjects: ");
		int numOfSub = sc.nextInt();

		int totalMarks = 0;
		for (int i = 1; i <= numOfSub; i++) {
			//Input: 
			//Take marks obtained (out of 100) in each subject.
			System.out.print("Enter marks obtained in subject " + i + ": ");
			int marks = sc.nextInt();
			
			//Calculate Total Marks: Sum up the marks obtained in all subjects.
			totalMarks = totalMarks + marks;
		}

		//Calculate Average Percentage:
		//Divide the total marks by the total number of subjects to get the average percentage.
		double avgPer = (double) totalMarks / (numOfSub * 100) * 100;

		String grade = CalculateGrade.calculateGrade(avgPer);  //  method call

		//Display Results: 
		//Show the total marks, average percentage, and the corresponding grade to the user
		System.out.println("\nResults:");
		System.out.println("Total Marks Obtained: " + totalMarks);
		System.out.println("Average Percentage: " + avgPer + "%");
		System.out.println("Grade: " + grade);

		sc.close();
	}

}
