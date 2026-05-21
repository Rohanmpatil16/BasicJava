interface r
{
void get();
void dis();
}
class f implements r
{
	public void get()
	{
		System.out.println("enter the numbers=");
		
	}
	public void dis()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println("c="+c);
		
	}
	
}
class inter
{
	public static void main(String args[])
	{
		f o=new f();
		o.get();
o.dis();
	}
}