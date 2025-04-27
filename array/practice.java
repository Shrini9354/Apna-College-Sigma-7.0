public class practice {
    public static boolean check(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>=2)
            {
                return true;
            }
        }
        return false;

    }
}
