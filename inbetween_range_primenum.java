import java.util.*;
public class inbetween_range_primenum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end number of the range:");
        int end = sc.nextInt();
        System.out.println("Now we can find Prime numbers between " + start + " and " + end + ":");
        for(int i=start;i<end;i++)
        {
            int count=0;
            for(int div=1;div<=i;div++)
            {
                if(i%div==0)
                {
                    count++;
                }
            }
        
            if(count==2)
            {
                System.out.println(i );
            }
            
        }

    }        
}
        
   