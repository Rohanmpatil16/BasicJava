public class parametric {
    int a,b,c;

    void get(int x,int y)
    {
        a=x;
        b=y;
    }

    void dis()
    {
        c=a+b;
        System.out.println(c);
    }

    public static void main(String args[])
    {
        parametric p=new parametric();
        p.get(10,20);
        p.dis();
    }
    
}
