
class CallByValue { // Class name should start with an uppercase letter
    
    public static void swap(int a, int b) { // Formal parameters
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a);
        System.out.println("After swap: b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a, b); // Actual parameters (arguments)
    }
}
