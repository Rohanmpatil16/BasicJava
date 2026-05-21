import java.util.*;
public class small_Andlarge_inArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
         int n=sc.nextInt();
        
        System.out.println("Enter the array:");
       
        int arr[]=new int[n];
        int i;
        int j;

        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Print the array:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
       int s=arr[0];
       int l=arr[0];
       for(j=1;j<arr.length;j++)
       {
        if(s>=arr[j])
        {
            s=arr[j];
        }
        else
        {
            l=arr[j];
        }
       } 

       System.out.println("\nSmallest element is:"+s);
       System.out.println("Largest element is:"+l);
    }

}