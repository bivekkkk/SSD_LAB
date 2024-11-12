package lab4;

/**
 * the ArrayProcessor class to calculate the length of given array
 */
public class ArrayProcessor {
	/**
	 * It uses iteration to count the length of the array
	 * 
	 * @param a the array whose length is to be calculated
	 * @return arrayCount the length of array
	 */
	int getArrayLength(Object[] a) {
		/**
		 * Stores the length of array
		 */
		int arrayCount = 0;
		// handles the exception while using infinite loop
		try {
			while (true) {
				Object t = a[arrayCount];
				arrayCount++;
				System.out.println(t);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
		}
		return arrayCount;// returns the length of the provided array
	}

//	short efficient method to do the same task
//	int getArrayLength(Object[] a) {
//		return a.length;
//	}

}
