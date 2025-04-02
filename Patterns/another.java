public class another {
    public static void main(String[] args) {
        int n = 5; // Define the height of the pyramid
        int curr_num = 1;

        for (int row = 1; row <= n; row++) {
            int num_space = n - row;

            // Print spaces
            for (int j = 1; j <= num_space; j++) {
                System.out.print("\t");
            }

            // Print current numbers
            for (int j = 1; j <= row; j++) {
                System.out.print(curr_num + "\t\t");
                curr_num++;
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}
