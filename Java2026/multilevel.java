public class multilevel {
    int a,b,c;
    void get()
    {
        a=10;b=20;
    }
    void dis()
    {
        c=a+b;
        System.out.println("The sum is: "+c);
    }
    
}
class c extends multilevel{
    void set()
    {
        c=a-b;
        System.out.println("Sub"+c);
    }
}

class d extends c{
    void display()
    {
        System.out.println("Result: "+c);
    }
    public static void main(String args[])
    {
        d obj=new d();
        obj.get();
        obj.dis();
        obj.set();
        obj.display();
    }
}
