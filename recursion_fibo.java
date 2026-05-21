public class recursion_fibo{
    public static int fibo(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
        

    }
    public static void main(String[] args) {
        int n=5;
        int result=fibo(n);
        for(int i=0;i<=n;i++)
        {
            System.out.println(+fibo(i)+" ");

        }
        System.out.println("Fibon of "+n+" is:"+result);
    }
}