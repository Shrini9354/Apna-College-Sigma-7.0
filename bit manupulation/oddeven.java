

public class oddeven {
    public static void oddeven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("no is even");

        }else{
            System.out.println("no is odd");
        }
    }
    public static void main(String[] args) {
        oddeven(3);
        oddeven(11);
        oddeven(89);
        oddeven(90);
    }
    
}
