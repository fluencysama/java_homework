import java.util.Scanner;

public class practice2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a new Scanner object.
		final double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value

		// Prompt the user to enter a montly saving amount
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		// Compute first month account value
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
    
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}
}
