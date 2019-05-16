
/*
 * Unit 1 Lab - Deliverable 1
 * @Author: Baraa S. Ali
 * Important note: assertion should be enabled prior to running this program.
 */

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {
		/* Variables Definitions */
		String eventType;
		int partySize;
		String result;
		String mealSuggestion = "formal"; /* assigned for Initialization purpose only*/
		String preparationSuggestion;
		Scanner sc = new Scanner(System.in);

		/* Get the user input */
		System.out.println("Please choose the event type (casual, semi-formal or formal):");
		eventType = sc.nextLine();
		/*Validate the user input*/
		assert (eventType.equals("casual") || eventType.equals("semi-formal")
				|| eventType.equals("formal")) : "Invalid input for evntType";
		System.out.println("Please enter the party size (minimum 1):");
		partySize = sc.nextInt();
		/*Validate the user input*/
		assert (partySize > 0) : "partySize must be greater than 0";

		/* Suggest a meal */
		if (eventType.equals("casual"))
			mealSuggestion = "sandwiches";
		else if (eventType.equals("semi-formal"))
			mealSuggestion = "fried chicken";
		else
			mealSuggestion = "chicken parmesan";

		/* suggest the preparation */
		if (partySize == 1)
			preparationSuggestion = "in the microwave";
		else if (partySize <= 12)
			preparationSuggestion = "in your kitchen";
		else // if partySize >= 13
			preparationSuggestion = "by a caterer";

		/* Print out the result, which shows the whole party plan */
		result = "Since you’re hosting a " + eventType + " event for " + partySize
				+ " participant(s), you should serve " + mealSuggestion + " prepared " + preparationSuggestion + ".";
		System.out.println(result);
	}

}
