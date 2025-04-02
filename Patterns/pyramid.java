public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // Define the height of the pyramid

        for (int row = 1; row <= n; row++) {
            int num_space = n - row;

            // Print spaces
            for (int j = 1; j <= num_space; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}
