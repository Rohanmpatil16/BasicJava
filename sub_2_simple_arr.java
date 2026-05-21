import java.util.*;
public class sub_2_simple_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        System.out.print("Enter the size of array:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=sc.nextInt();
        }

        int sub[]=new int[n1>n2?n1:n2];
        for(int k=0;k<sub.length;k++)
        {
            int val1=(k<n1?arr1[k]:0);
            int val2=(k<n2?arr2[k]:0);
            sub[k]=val1-val2;
        }
        for(int k=0;k<sub.length;k++)
        {
        System.out.println("Substraction is:"+sub[k]);
        }

    }
    
}
