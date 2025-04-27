import java.util.Arrays;
 class inbuilt {
    public static void printar(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,8,2};
        Arrays.sort(arr);
        printar(arr);
        

    
}
 }
