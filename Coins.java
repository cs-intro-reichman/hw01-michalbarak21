/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Created a new input value for the user to submit. 
		// Note that type of data is integer, as we do not expect to encounter fractions!	
		int cents = Integer.parseInt(args[0]);
		// Calculate the maximal amount of cents that can be exchanged, and the appropriate remainder
		int quarters = (int) (cents / 25); 
		int remainder = (int) (cents - (quarters * 25)); 
		// Print the exchange output for the user
		System.out.println("Use " + quarters + " quarters and " + remainder + " cents");
	}
}