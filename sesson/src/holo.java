class Holo {

    public static void main(String[] args) {
        int n = 5; // height of the rectangle
        int m = 4; // width of the rectangle

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print '*' for the border of the rectangle
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    // Print space for the inside of the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next line after finishing one row
            System.out.println();
        }
    }
}