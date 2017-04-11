
/**@Program to find a substring in a String 
 * by using an inbuilt method of String class.*/

/**@Import Scanner for user input*/
import java.util.Scanner;

/** @Define a class FindSubstring */
public class FindSubstring {

	public static void main(String[] args) {
		/** @Allowing user input */
		Scanner o = new Scanner(System.in);
		System.out.println("Enter the string");

		/** @Enter substring to find */
		String s = o.nextLine();
		System.out.println("Enter the sub string you want to search");
		String s1 = o.nextLine();

		/** @Condition to check whether sub string is present */

		/** @Using contains method */
		if (s.contains(s1)) {
			System.out.println("sub string found");
		} else {
			System.out.println("sub string not found");
		}
	}
}