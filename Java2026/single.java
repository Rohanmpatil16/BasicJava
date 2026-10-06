public class single {

    int a=10;
    int b=20;
    int c;

    void get()
    {
        c=a+b;
        System.out.println("The sum is: "+c);
    }
    

}
class c extends single{
    void dis()
    {
        c=a-b;
        System.out.println("The difference is: "+c);
    }
    public static void main(String args[])
    {
        c obj=new c();
        obj.get();
        obj.dis();
    }
}
