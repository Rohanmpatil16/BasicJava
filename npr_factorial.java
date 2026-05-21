import java.util.*;
public class npr_factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n=");
        int n=sc.nextInt();
        System.out.println("Enter the value of r=");
        int r=sc.nextInt();


        int factn=1;
        for(int i=1;i<=n;i++)
        {
            factn=factn*i;
           
        }
         System.out.println("Factorial value of n is "+factn);

        int factr=1;
        for(int j=1;j<=r;j++)
        {
            factr=factr*j;
            
        }
        System.out.println("Factorial value of r is "+factr);

        int npr=factn/factr;
        System.out.println("Value of NPR is = "+npr);

    }
    
}
