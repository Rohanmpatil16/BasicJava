import java.util.*;
public class fact {
    public static void main(String[] args) {
        int a,i,fac=1;
        System.err.println("Enter the number and calculate that factorial Number=:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
         fac=fac*i;   
        }
        System.err.println("Factprial num is "+fac);
    }
    
}
