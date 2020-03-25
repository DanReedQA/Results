package com.qa.results;

public class Runner {

	// input your grade to see if you have passed (Max grade 150 for each subject)
	public static int phyisics = 99;
	public static int biology = 100;
	public static int chemistry = 143;
	// -------------------------------------------

	// Math
	public static int total = (phyisics + biology + chemistry);
	public static Double percentage = (double) ((total * 100) / 450);

	public static double physPercent = phyisics * 100 / 150;
	public static double chemPercent = chemistry * 100 / 150;
	public static double bioPercent = biology * 100 / 150;

	public static int count = 0;
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
		System.out.println(result.printTotalPercentage("Your total percentage: " + percentage + "%"));

		// if you scored over 60% overall you pass
		// displays the percentage of each exam result
		if (physPercent > 60) {
			System.out.println("Passed Physics with: " + physPercent + "%");
		} else {
			System.out.println("Failed Physics with: " + physPercent + "%");
			count++;
		}

		// -------------------------------------------
		if (chemPercent > 60) {
			System.out.println("Passed Chemisty with: " + chemPercent + "%");
		} else {
			System.out.println("Failed Chemisty with: " + chemPercent + "%");
			count++;
		}

		// -------------------------------------------
		if (bioPercent > 60) {
			System.out.println("Passed Biology with: " + bioPercent + "%");
		} else {
			System.out.println("Failed Biology with: " + bioPercent + "%");
			count++;
		}

		// -------------------------------------------
		if (count >= 1) {
			System.out.println("You have failed " + count + " exams.");
		} else {
			System.out.println("You have passed!");
		}
	}

}
