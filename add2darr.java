import java.util.*;
public class add2darr {
    public static void main(String[] args) {
        int a[][]=new int[2][2];int b[][]=new int[2][2];int c[][]=new int[2][2];int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Enter the 2nd array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t "+a[i][j]);
            }
            System.err.println("");
           
        }
        System.out.println("2nd array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t "+b[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Addition is=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print("\t"+c[i][j]);
            }
            System.out.println("");
        }
        

    }
    
}
