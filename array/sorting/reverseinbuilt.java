import java.util.Arrays;
import java.util.Collections;
 class reverseinbuilt {
    public static void printar(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
 
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Integer arr[]={5,4,3,8,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printar(arr);
        

    
}
 }
