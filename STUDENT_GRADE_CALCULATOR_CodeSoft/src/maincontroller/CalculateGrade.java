package maincontroller;

public class CalculateGrade {

	public static String calculateGrade(double averagePercentage) {
		//Grade Calculation: 
		//Assign grades based on the average percentage achieved.
		if (averagePercentage >= 90) {
			return "A";
		} else if (averagePercentage >= 80) {
			return "B";
		} else if (averagePercentage >= 70) {
			return "C";
		} else if (averagePercentage >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
}
