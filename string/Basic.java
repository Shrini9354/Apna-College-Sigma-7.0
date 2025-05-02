import java.util.*;
 class Basic {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
       
        String str="shrinivas";
        String str2=new String("abcd");

     Scanner sc=new Scanner(System.in);
     String name;
     name=sc.nextLine();
     String fullname=str+" "+name;
     printletters(fullname);
    }
    
}
