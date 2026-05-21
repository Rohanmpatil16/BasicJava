import java.util.Arrays;
import java.util.Scanner;
public class ascinarr {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(+a[i]);
        }
        System.out.println("Convert into string:");
      System.out.println(Arrays.toString(a));
      Arrays.sort(a);
      
      System.out.println("Sorted array in ascending order"+Arrays.toString(a));
      sc.close();
    }
    
}
