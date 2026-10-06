import java.util.Scanner;
public class rect {
    int l,b,a;

    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        l=sc.nextInt();
        b=sc.nextInt();

    }

    void dis()
    {
        a=l*b;
        System.out.println("The area of the rectangle is "+a);
    }
    public static void main(String args[])
    {
        rect r=new rect();
        r.get();
        r.dis();
    }
}
