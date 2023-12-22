/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// First we will accept 3 integers as input from user
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// Now we will create a bool that checks if the condition set by the Triangle Inequality Theorem is met
		// Finally the function prints out (in format) the answer of the for the 3 given values
		boolean isTriangle = ((a + b > c) && (a + c > b) && (b + c > a)); 
		System.out.println(a + ", " + b + ", " + c + ": " + isTriangle); 
		}
	
	}
