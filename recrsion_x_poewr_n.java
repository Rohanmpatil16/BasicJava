public class recrsion_x_poewr_n {
    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return x;
        }

        return x * pow(x, n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        int x=2;
        pow(x, n);
        System.out.println(x+" power of "+n+" is "+pow(x,n));

    }

    
}
