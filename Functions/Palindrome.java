public class Palindrome {
    public static boolean isPalindrome(int n) {
        int orig = n;
        int rev = 0;
        
        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10; // Don't forget to reduce n
        }
        
        return orig == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(136)); // This will print false
        System.out.println(isPalindrome(121)); // This will print true
    }
}