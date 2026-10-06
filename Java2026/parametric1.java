public class parametric1 {
    int a;
    String name;

    void get(int x,String n)
    {
        a=x;
        name=n;
    }

    void dis()
    {
        System.out.println("The value of a is "+a);
        System.out.println("The name is "+name);
    }
    public static void main(String args[])
    {
        parametric1 p=new parametric1();
        p.get(10,"John");
        p.dis();
    }
    
}
