abstract class ab{
int a=10,b=20,c;
void get()
{
    System.out.println("Enter addition=\n");
}
abstract void dis();
{}
}
class abstrac extends ab{
    void dis()
    {
        c=a+b;
        System.out.println(c);

    }
    public static void main(String args[])
    {
        abstrac a=new abstrac();
        a.dis();
    }
}