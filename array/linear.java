 class linear {
    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) { // Check if the key matches the current array element
                return i; // Return the index where the key is found
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 10}; // Array of numbers
        int key = 10; // Key to search for

        int index = linear(numbers, key); // Call the linear search function

        // Output the result
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}
