import java.util.*;

public class pythagoras {
public static void main (String args[])
{
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the three sides of triangle");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    boolean flag=false;

    // if(a>b && a>c)
    // {
    //     if(a*a==b*b+c*c)
    //     {
    //         flag=true;        }
    // }
    // else if(b>a && b>c)
    // {
    //     if(b*b==a*a+c*c)
    //     {
    //         flag=true;        }
    // }
    // else if(c>a && c>b)
    // {
    //     if(c*c==a*a+b*b)
    //     {
    //         flag=true;
    //     }

    // }
    // System.out.println("It is Pythagoras Triplets "+flag);
    
    if(a*a==b*b+c*c ||
    b*b==c*c+a*a ||
    c*c==b*b+a*a)
    {
        flag=true;
        System.out.println("It is Pythagoras triplet ?"
        +flag);

    }
    else{
    flag=false;
        System.out.println("It is Pythagoras triplet ?"
        +flag);
    }
}    
}
