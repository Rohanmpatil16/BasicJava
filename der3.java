class a
{
int an;
  a(int x)
  {
	  an=x;
	 
  }
  
}
class b extends a
{
	
String sn;
	b(int x,String s)																			)
	{
		super(x);
		sn=s;
	}
	void show()
	{
		System.out.println("num="+an);
				System.out.println("name="+sn);

	}
	
}
class der3
{
	public static void main(String args[])
	{
		b o=new b(04,"moin");
		o.show();
	}
}