public class rec_logn_power {
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

        

        if(n%2==0)
        {
            return pow(x,n/2) * pow(x,n/2);
        }
        else
        {
            return pow(x,n/2) * pow(x,n/2) * x;
            
        }
    }
    public static void main(String[] args) {
        int x=3;
        int n=5;
        pow(x,n);
        System.out.println(x+" power "+n+" is :"+pow(x,n));

    }

}
