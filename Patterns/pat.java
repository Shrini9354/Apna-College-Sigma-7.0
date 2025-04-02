

public class pat {
    public static void main(String[] args) {
        int n = 5; // Define the number of rows for the pattern
        for (int row = 1; row <= n; row++) {
            int numspace = n - row;
            for (int j = 1; j <= numspace; j++) {
                System.out.print(" "); // Use print instead of println to stay on the same line
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* "); // Use print to keep stars on the same line
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}
