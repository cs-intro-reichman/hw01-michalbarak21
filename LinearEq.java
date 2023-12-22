/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
		// Created the 3 input values provided by the user
		// Note that the 3 inputs accept fractions from user (AKA double)
		double a = Double.parseDouble(args[0]); 
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		// Calculates the value of x given the 3 input values
		// Note that in task description we can assume the value of a cannot be 0! 
		double x = (c - b) / a;
		// Prints out the linear equation for user to view, then the calculated value of x
		System.out.println(a + " * x + " + b + " = " + c);
		System.out.println("x = " + x);

	}

}