
import java.util.*;
public class findgreaternum {
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three Numbers=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println();
        
        if(a>b & a>c)
        {
            System.out.println(a+" is greater number");
        }

        else if(b>a & b>c)
        {
            System.out.println(b+" is greater number");
        }

        else{
            System.out.println(c+" is greater number");
        }
        
        sc.close();
    }
    
}
