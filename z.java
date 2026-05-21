import java.util.*;
class coov
{
	int a,b,c;
	coov()
	{
		a=20;
		b=30;
		c=a+b;
		System.out.println(+c);
		
	}
	coov(int x,int y)
	{
		a=x;
		b=y;
		c=a*b;
		System.out.println(+c);
		
	}
}
class z
{
	public static void main(String args[])
	{
		coov o=new coov();
		coov o1=new coov(3,2);
	}
}
	
	
