public class sustring {
    public static String Substr(String str,int si,int ei ){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=str.charAt(i);
        }
        return substring;
    }
    

    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(Substr(str,0,5));

    }
    
}
