import java.util.*;
class stud
{
int rn;
String nm;
void setdata()
{
Scanner rb=new Scanner(System.in);
System.out.println("enter the roll no:");
rn=rb.nextInt();
System.out.print("enter the name:");
nm=rb.nextLine();	
}
void showdata()
{
	System.out.println("roll no="+rn);
	System.out.println("name="+nm);
}
}
}

class ca
{
	public static void main(String args[])
	{
		stud o=new stud();
		o.setdata();
		o.showdata();
	}
	
}