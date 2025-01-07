import java.util.*;
public class arrusingscann {
    public static void main(String[] args) {
        int a[]=new int[5],i;
        System.err.println("Enter the array:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        System.err.println("Array is:");
        for(i=0;i<a.length;i++)
        {
            System.err.print("\t"+a[i]);
        }
        
        
    }
    
}
