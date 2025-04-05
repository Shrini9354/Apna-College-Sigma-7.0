package array;

class largest {
    public static int largest(int numbers[]) {
        int larg = Integer.MIN_VALUE; // Initialize the largest value
        int smallest = Integer.MAX_VALUE; // Initialize the smallest value

        for (int i = 0; i < numbers.length; i++) { // Correct loop using 'numbers'
            if (larg < numbers[i]) { // Check for the largest value
                larg = numbers[i];
            }
            if (smallest > numbers[i]) { // Check for the smallest value
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number is: " + smallest); // Print the smallest value
        return larg; // Return the largest value
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8}; // Define the array

        System.out.println("Largest number is: " + largest(numbers)); // Print the largest value
    }
}
