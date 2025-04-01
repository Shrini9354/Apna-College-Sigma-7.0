 class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }
        return f;
    }
        public static int bincoe(int n,int r){
            int fn=fact(n);
            int fr=fact(r);
            int nmr=fact(n-r);
             int bincoe= fn/(fr*nmr);
             return bincoe;
        }
        
    public static void main(String[] args) {
        System.out.println(bincoe(5,2));
}
 }