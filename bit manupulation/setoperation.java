
public class setoperation {

public static int seth(int n,int i){
    int bitmask=1<<i;
    return n|bitmask;
}
    public static void main(String[] args) {
        System.out.println(seth(10, 2));
    }
}
