import java.util.*;
public class pound_to_kilo {
    public static void main(String args[])
    {
        int pou;
        double kil;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of pound=");
        pou=sc.nextInt();

        kil=pou*0.45359237;
        System.out.println(pou+ " pound is equal to "+kil+" kilogram");
    }
    
}
