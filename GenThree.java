/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// First we will accept 2 integers as input from user, that will serve as our range
		// We will assume that a < b based on the question description
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// Next we will generate 3 random numbers using the Math library - note the 3 random numbers are of type double! 
		// After generation, we will multiply the generated num by the difference between a and b to recieve a random number in rabge [0, b - a)
		// Finally we will add a to the random number generated to recieve a random number in range [a, b)
		int gen1 = (int) ((Math.random() * (b - a)) + a); 
		System.out.println(gen1);
		int gen2 = (int) ((Math.random() * (b - a)) + a); 
		System.out.println(gen2);
		int gen3 = (int) ((Math.random() * (b - a)) + a); 
		System.out.println(gen3);
		// Next we will identify the minimal number generated using Math library function min
		int min_gen = Math.min(gen1, gen2); 
		min_gen = Math.min(min_gen, gen3);
		System.out.println("The minimal generated number was " + min_gen);
	}
}
