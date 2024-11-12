package lab3;

import java.util.Arrays;

/**
 * The Stats class provides methods to perform statistical operations
 * on an array of numbers, such as finding the maximum, minimum, total, 
 * and average values.
 */
public class Stats {

    private int[] numbers; // Array to hold numbers
    private int count;     // Counter to keep track of values added

    /**
     * Constructor to initialize the Stats object with a given capacity.
     * 
     * @param capacity the maximum number of values the Stats object can store
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0;
    }

    /**
     * Adds a value to the numbers array.
     * 
     * @param value the value to add to the array
     */
    public void addValue(int value) {
        if (count < numbers.length) {
            numbers[count] = value;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more values.");
        }
    }

    /**
     * Gets the number of values added to the array.
     * 
     * @return the number of values stored
     */
    public int getCount() {
        return count;
    }

    /**
     * Finds the maximum value in the numbers array.
     * 
     * @return the maximum value in the array
     */
    public int getMaxValue() {
        int max = numbers[0];
        // Loop through the array to find the max value
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in the numbers array.
     * 
     * @return the minimum value in the array
     */
    public int getMinValue() {
        int min = numbers[0];
        // Loop through the array to find the min value
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Calculates the total of all values in the numbers array.
     * 
     * @return the total of all values in the array
     */
    public int getTotal() {
        int total = 0;
        // Total all values within the array
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates the average of all values in the numbers array.
     * 
     * @return the average of all values in the array
     */
    public double getAverage() {
        int sum = 0;
        // Sum all values within the array
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return (double) sum / count;
    }

    /**
     * Returns a string representation of the numbers array.
     * 
     * @return a string containing the array values
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(numbers, count)); // Only show added values
    }
}
