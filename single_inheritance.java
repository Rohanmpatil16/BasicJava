public class single_inheritance {
int a,b,c;
void get()
{
    a=10;
    b=20;
}    
void dis()
{
    c=a+b;
    System.out.println("Addition is="+c);
}
public static void main(String args[])
{
    single_inheritance1 obj=new single_inheritance1();
    obj.get();
    obj.dis();
    obj.mul();
}
}
class single_inheritance1 extends single_inheritance
{
    void mul()
    {
        c=a*b;
        System.out.println("Multiplication is="+c);
    }
   
}
