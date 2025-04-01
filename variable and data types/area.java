import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float rad = sc.nextFloat();
        float area = 3.14159f * rad * rad; // Using a more precise value for π
    
        System.out.printf("The area of the circle is: %.2f%n", area); // Formatted output
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
