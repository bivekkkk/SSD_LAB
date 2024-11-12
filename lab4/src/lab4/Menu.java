package lab4;

/**
 * It contains the method to display as menu option.
 */
public class Menu {
	/**
	 * Displays the selected menu option.
	 * @param opt the option chosen
	 * @throws InvalidOptionException
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		//Switch case to check if the input is valid or not
		switch (opt) {
			case 1:
				System.out.println("Menu Option 1 Selected");
				break;

			case 2:
				System.out.println("Second Option Selected");
				break;

			case 3:
				System.out.println("Third Option Selected");
				break;

			case 4:
				System.out.println("Fourth Option Selected");
				break;
			default:
				//throws exception if opt is not 1, 2, 3, or 4
				throw new InvalidOptionException("Invalid menu option: "+ opt);

		}
	}
}
