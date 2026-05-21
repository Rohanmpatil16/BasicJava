import java.util.Scanner;
public class twodarray { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][2],i,j;
        System.err.println("Enter the array:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }            
        } 
        System.err.println("Array is:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.err.print("\t"+a[i][j]);
            }
            System.err.println();
        }

    }
}
