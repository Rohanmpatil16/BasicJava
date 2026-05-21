public class recursion_add1 {
public static void rec(int n,int i,int sum )
{
    if(i==n)
    {
        sum+=i;
    System.out.println("Sum="+sum);
    return;
    }
    sum+=i;
    rec(n,i+1,sum);
    
    
}

    public static void main(String[] args) {
        int n=5;
         int i=1;
        int sum=0;
        rec(n, i, sum);
    }
    
}
