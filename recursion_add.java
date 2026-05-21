public class recursion_add {
    public static void rec (int n,int add) {

        if(n>5)
        {
            System.out.println(add);
            return;
        }
        rec(n+1,add+n);
        
        
    }
    public static void main(String[] args) {
        int n=1;
        int add=0;
        rec(n, add);
    }
    
}
