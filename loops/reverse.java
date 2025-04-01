public class reverse {
    public static void main(String[] args) {
        int n=10899;
        while(n>0){
            int last=n%10;
            System.err.print(last);
            n=n/10;
        }
        System.out.println();
    }
    
}
