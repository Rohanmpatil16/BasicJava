import java.util.*;
public class inbetween_prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range inbetween you want print prime:");
        int a=sc.nextInt();
        int n=sc.nextInt();
        for(int i=a;i<=n;i++)
        {
            boolean isprime=true;
            if(i<=1)
            {
                isprime= false;
            }
            else
            {
                for(int j=2;j*j<=i;j++)
                {
                    if(i%j==0)
                    {
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime)
            {
                System.out.println(i);
            }
            
        }


    }
}