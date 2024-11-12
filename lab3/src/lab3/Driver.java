package lab3;


import java.util.Random;

/**
 * The Driver class demonstrates the functionality of the Stats class
 * by generating random numbers and calculating statistics.
 */
public class Driver {

    public static void main(String[] args) {
        final int NUMBER_OF_VALUES = 10; // Constant for the number of random values

        // Create a Stats object with the capacity to store 10 numbers
        Stats stats = new Stats(NUMBER_OF_VALUES);

        // Random number generator
        Random random = new Random();

        // Add 10 random values to the Stats object
        for (int i = 0; i < NUMBER_OF_VALUES; i++) {
            stats.addValue(random.nextInt(100)); // Random number between 0 and 99
        }

        // Display the numbers stored in the Stats object
        System.out.println("Numbers stored: ");
        System.out.println(stats);

        // Display the statistics of the numbers
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMinValue());
        System.out.println("Maximum value = " + stats.getMaxValue());
    }
}

