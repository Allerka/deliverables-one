import java.util.Scanner;

public class dinner {

	public static void main(String[] args) {
		// Initial setup
		Scanner scan = new Scanner(System.in);
		String eventType;
		int partySize;
		String result;
		
		// First user input
		System.out.println("You're having a party! Let's figure out what to make.");
	do { 
		System.out.println("What kind of event is it? Casual, semi-formal, or formal?");
		eventType = scan.next();
		
	if (eventType.equalsIgnoreCase("casual")) {
		System.out.println("Got it, casual.");
	} else if (eventType.equalsIgnoreCase("semi-formal")) {
		System.out.println("Got it, semi-formal.");
	} else if (eventType.equalsIgnoreCase("formal")) {
		System.out.println("Got it, formal.");
	} else {
		eventType = "invalid";
		System.out.println("Invalid entry. Please try again.");
		}	 
		} while (eventType.equalsIgnoreCase("invalid"));
	
	// Second user input
	System.out.println("Now, how many people are coming?");
	partySize = scan.nextInt();
	System.out.println(partySize + " people, huh?");
	
	// Calculate result
	if (eventType.equalsIgnoreCase("casual")) {
		if (partySize == 1) {
			result = "A casual dinner with 1 person, that calls for sandwiches prepared in the microwave.";
		} else if (partySize >= 2 && partySize <= 12) {
			result = "A casual dinner with " + partySize + " people, that calls for sandwiches prepared in the kitchen.";
		} else result = "A casual dinner with " + partySize + " people, that calls for sandwiches handled by a caterer.";
	} else if (eventType.equalsIgnoreCase("semi-formal")) {
		if (partySize == 1) {
			result = "A semi-formal dinner with 1 person, that calls for fried chicken prepared in the microwave.";
		} else if (partySize >=2 && partySize <= 12) {
			result = "A semi-formal dinner with " + partySize + " people, that calls for fried chicken prepared in the kitchen.";
		} else result = "A semi-formal dinner with " + partySize + " people, that calls for fried chicken prepared by a caterer.";
	} else {
		if (partySize == 1) {
			result = "A formal dinner with 1 person, that calls for chicken parmesan prepared in the microwave, apparently.";
		} else if (partySize >= 2 && partySize <= 12) {
			result = "A formal dinner with " + partySize + " people, that calls for chicken parmesan prepared in the kitchen.";
		} else result = "A formal dinner with " + partySize + " people, that calls for chicken parmesan prepared by a caterer.";
	}
	// Display result
	scan.close();
	System.out.println(result);
	System.out.println("Better get started!");
	}
}
