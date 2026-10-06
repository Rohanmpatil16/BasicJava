import java.util.*;
public class find_element_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

    
    System.out.println("Find That num:");
    int f=sc.nextInt();

    int index=-1;
    for(int i=0;i<a.length;i++)
    {
        if(f==a[i])
        {
            index=i;
            break;
        }
    } 
    System.out.println("Index of That num is:"+index);       
    }
    
}
