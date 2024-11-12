package lab4;

/**
 * the driver class that initializes the ArrayProcessor class and also display
 * the output
 */
public class ArrayProcessorDriver {
	/**
	 * this is the main method
	 * 
	 * @param args takes the argument form the system
	 */
	public static void main(String[] args) {
		// object of ArrayProcessor is created
		ArrayProcessor ap = new ArrayProcessor();
		// it stores the value returned after an array is passed as the parameter
		int len = ap.getArrayLength(new String[] { "one", "two", "three", "four", "five" });

		System.out.println("Array length is: " + len);
	}

}
