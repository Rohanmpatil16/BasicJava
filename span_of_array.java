import java.util.*;
class span_of_array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<a.length;i++)
        {
             a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];

        int span;

        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
             {
                min=a[i];
            }
        }

        System.out.println("Max num is:"+max);
        System.out.println("Min num is:"+min);
        span=max-min;
        System.out.println("Span of num is:"+span);

    }

}
