package lab4;

/**
 * This is a custom exception class created to handle exception in Menu class
 */
@SuppressWarnings("serial")
public class InvalidOptionException extends Exception {

	/**construction an InvalidOptionException with a custom exception message
	 * @param message the custom message to be displayed
	 */
	public InvalidOptionException(String message) {
		super(message);
	}
}
