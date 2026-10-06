import java.util.*;
public class para {
    int a;
    String s;
    void get(int x,String y)
    {
       a=x;
        s=y;
    }
    void dis()
    {
        System.out.println("roll no="+a);
        System.out.println("Name="+s);
    }
}
class para_b
{
    public static void main(String[] args) {
        para o=new para();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no=");
        int x = sc.nextInt();
        System.out.println("Enter the Name=");
        String y=sc.next();
        o.get(x,y);
        o.dis();
    }
}
