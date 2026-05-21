import java.util.*;

public class LCM_GCD_num{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    int com1=a;
    int com2=b;

    //find gcd
    while(a % b != 0)
    {
        int rem=a%b;
        a=b;
        b=rem;
    }

    int gcd=b;

    //find LCM;

    int lcm=(com1 * com2)/gcd;

    System.out.println("GCD="+gcd);
    System.out.println("LCM="+lcm);


    }
}
