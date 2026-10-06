class a
{
	int a,b,c;
	void get()
	{
		a=20;
		b=30;
		
	}
	void dis()
	{
		c=a+b;
		System.out.println("addition="+c);
	}
}
class b extends a
{
	void dis2()
	{
		c=a*b;
		System.out.println("Multiplication="+c);
	}
}
class c extends a
{
	void dis3()
	{
		c=a-b;
		System.out.println("substraction="+c);
	}
	
}
class hira
{
public static void main(String args[])
{
b o=new b();
c r=new c();
o.get();
o.dis();
o.dis2();
r.dis3();	
}	
}