
import java.util.Arrays;

public class reverse_array{
public static void main(String args[])
{
    int swap;
    int a[]={1,2,3,4,5};
    System.out.println("Normal Array:"+Arrays.toString(a));
   
    int i=0;
    int j=a.length-1;
      while(i<j)
        {
            swap=a[i];
            a[i]=a[j];
            a[j]=swap;

            i++;
            j--;
        }
    System.out.println("Reverse the array:"+Arrays.toString(a));

}
    
}
