public class recursoin_fact1 {
    public static int rf(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int num=rf(n-1);
        int fact=num*n;
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int result=rf(n);
        System.out.println("Factorial of "+n+" is: "+result);
    }
    
}
