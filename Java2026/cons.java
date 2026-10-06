import java.util.Scanner;
public class cons {
     int a,b,c;

     void get()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

     }
     void dis()
     {
        c=a+b;
        System.out.println("The sum of a and b is "+c);
     }

     public static void main(String args[])
     {
        cons c1=new cons();
        c1.get();
        c1.dis();
     }
}
