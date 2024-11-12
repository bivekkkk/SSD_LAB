package lab4;

import java.util.Scanner;

/**
 * this class is used for integer division
 */
public class Excep {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			//the first number is asked to the user and stored
			System.out.printf("Enter the number:");
			String total = scanner.nextLine();
			//the divisor is stored in divisor variable
			System.out.printf("Enter the divisor:");
			String divisor = scanner.nextLine();
			//this changes the input into integer and performs divisor
			int result = Integer.parseInt(total) / Integer.parseInt(divisor);
			System.out.println(result);

			scanner.close();

		} catch (ArithmeticException e) {
			System.out.println("The entered value was 0(cannot divide by 0)");
//			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("The Entered value must be a number");
		} finally {
			System.out.println("The End!");
		}
	}
}
