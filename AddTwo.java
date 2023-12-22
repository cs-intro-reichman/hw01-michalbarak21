/*/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
        // Created two integers that recieve a value as input from user
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
		// Print out the sum of both integers (i.e a + b) in the following format: "a + b = sum"
        System.out.println(a + " + " + b + " = " + (a + b));
	}
}
