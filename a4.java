interface rr
{
	void get();
	void show();
}
class rrr implements rr
{
	int a=20,b=20,c;
	public void get()
	{
		c=a+b;
	}
	public void show()
	{
		System.out.println(c);
	}
}
class a4
{
	public static void main(String args[])
	{
		rrr o=new rrr();
		o.get();
		o.show();
	}
	
} 