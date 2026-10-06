class sqr extends Thread
{
	public void run()
	{
		int a=10,b;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		b=a*a;
		System.out.println("Square of number="+b);
	}
	
}
class fact extends Thread
{
	public void run()
	{
		int a=5,i,f=1;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		for(i=1;i<=a;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial number="+f);
		
	}
	
}
class sqr2 extends Thread
{
	public void run()
	{
		int a=2,i;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		for(i=1;i<=10;i++)
		{
			
			System.out.println("table of 2=\n"+(a*i));
		}
		
	}
	
}
class multhe
{
	public static void main(String args[])
	{
		sqr o=new sqr();
		fact r=new fact();
		sqr2 rp=new sqr2();
		o.start();
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
		r.start();
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
		rp.start();
		
	}
	
}