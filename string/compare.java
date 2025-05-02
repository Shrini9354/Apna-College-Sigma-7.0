public class compare {
    public static void main(String[] args) {
        String s1="Shri";
        String s2="Shri";
        String s3=new String("Shri");
        
        if(s1==s3){
            System.out.println(" equal");
        }
        else{
            System.out.println("not equal");
            
        }
        if(s1.equals(s3))
        {
            System.out.println("yees it is equal");

        }
        else{
            System.out.println("nope ");
        }

    }
    
}
