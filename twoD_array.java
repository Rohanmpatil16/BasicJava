import java.util.*;
public class twoD_array {

    public static void main(String[] args) {
        
    
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int c[][]=new int[2][2];

    Scanner sc=new Scanner(System.in);
     int i,j;
     System.out.println("enter the first array:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }

    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.println(a[i][j]+" ");    
        }
    }



    System.out.println("enter the second array:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }

    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.println(b[i][j]+" ");    
        }
    }

}
}