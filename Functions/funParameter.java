

import java.util.Scanner;

public class funParameter {
    public static void printhello(){
        System.out.println("Hello, World!");
    }
    public static void calculate(int num1,int num2) {//formal parametrs 
       int sum=num1+num2;
        System.out.println("sum is"+sum);
    
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculate(a,b);//actual parameters coming when function is calling also called argumemnts
    }
}
