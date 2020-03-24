package com.qa.results;

public class Runner {

	// input your grade to see if you have passed (Max grade 150 for each subject)
	public static int phyisics = 2;
	public static int biology = 143;
	public static int chemistry = 85;
	// -------------------------------------------

	// Math
	public static int total = (phyisics + biology + chemistry);
	public static Double percentage = (double) ((total * 100) / 450);
	// -------------------------------------------

	public static void main(String[] args) {

		// Create instance of the ResultCounter as a new object
		ResultsCounter result = new ResultsCounter();

		// Print out the individual results across the three exams
		System.out.println(result.printMarksPerSubject("Phyisics Result: " + phyisics + " // Biology Result: " + biology
				+ " // Chemistry Result: " + chemistry));

		// print the sum of the total marks across the three exams
		System.out.println(result.printTotalMarks("Your total marks: " + total));

		// print total percentage
		System.out.println(result.printTotalPercentage("Your total percentage: " + percentage));

		// if you scored over 60% overall you pass
		if (percentage > 60) {
			System.out.println("You have passed!");
		} else {
			System.out.println("You have failed!");
		}
	}

}
