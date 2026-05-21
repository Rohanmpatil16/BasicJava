class a
{
final  int a=20;
void show()
{
	
	System.out.println(a);
}
}
class b extends a
{
void show()

{
		super.show();
	System.out.println(a);
}
}
class c extends b
{
void show()
{
		super.show();

	System.out.println(a);
}
}
class d extends c
{
void show()
{	super.msg();

	System.out.println(a);
}
}
class rohu
{
	public static void main(string args[])
	{
		d o=new d();
o.show();

	}
}