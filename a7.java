import java.util.*;
class a7
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int i,j;
		Scanner r=new Scanner(System.in);
        for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=r.nextInt();
			}
		}
		//Scanner r=new Scanner(System.in);
        for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}
}