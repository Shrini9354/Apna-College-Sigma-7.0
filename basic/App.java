 import java.util.*;
 class App {
    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int even=0;
     int odd=0;
     for(int i=1;i<=n;i++)
    {
        int x=sc.nextInt();
        if(x%2==0)
        {
            even+=x;

        }
        else{
            odd+=x;
        }
    }
System.out.println("sum of elements"+even);
System.out.println("sum of elements"+odd);

    }
}
