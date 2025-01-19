
import java.util.Scanner;

public class area_of_para {
    int a,b,c;
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number=");
        a=sc.nextInt();
        System.out.println("Enter the Second Number=");
        b=sc.nextInt();
    }
    void dis()
    {
        c=a*b;
        System.out.println("Area is " +c);
    }
    
}
class aop{
    public static void main(String[] args) {
        area_of_para o=new area_of_para();
        o.get();
        o.dis();
    }
}
