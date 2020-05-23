import java.util.Scanner;

/**
 * 
 */

/**
 * @author 12368
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	 {
	 System.out.println("Enter string to reverse:");
	 Scanner read = new Scanner(System.in);
	 String str = read.nextLine();
	 String reverse = "";
	 /*git branch created 
	  * branch 1
	  */
	 
	 for(int i = str.length() - 1; i >= 0; i--)
	 {
	 reverse = reverse + str.charAt(i);
	 }
	 
	 System.out.println("Reversed string is:");
	 System.out.println(reverse);
	 }

}
