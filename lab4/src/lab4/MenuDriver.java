package lab4;

/**
 * The driver class to test the Menu and InvalidOption class
 */
public class MenuDriver {

	public static void main(String[] args) {
		Menu menu = new Menu();
		//test the option (valid and Invalid)
		try {
			menu.displayMenuOption(1);
			menu.displayMenuOption(2);
			menu.displayMenuOption(3);
			menu.displayMenuOption(5);
		} catch (InvalidOptionException e) {
			//catches and handles any invalid options
			System.out.println("Error: " + e.getMessage());
		}
	}

}
