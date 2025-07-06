import java.util.*;
public class add_2_simple_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n1=sc.nextInt();
        int a1[]=new int[n1];
        System.out.println("Entering the first array");
        int i,j;
        for( i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }

        System.out.print("Enter the Size of array:");
        int n2=sc.nextInt();
        int a2[]=new int[n2];
        System.out.println("Entering the Second array");
        for( j=0;j<a2.length;j++)
        {
            a2[j]=sc.nextInt();
        }
        
        int []sum=new int[n1>n2?n1:n2];

        for(int k=0;k<sum.length;k++)
        {
            int val1 = (k < n1) ? a1[k] : 0;
            int val2 = (k < n2) ? a2[k] : 0;
             sum[k] = val1 + val2;
        }

        for(int k=0;k<sum.length;k++)
        {
            System.out.println("Addition is:"+sum[k]);
        }
    }
    
}

