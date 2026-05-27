public class method_over {
    int a,b,temp;
    float x,y,t;

    void get()
    {
        a=10;b=20;
        System.out.println("1st swap");
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);

    }
    void get(int x)
    {
        System.out.println("second swap");
        temp=x;
        x=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
    }

    void get(float x,float y)
    {
        System.out.println("third swap");
        t=x;
        x=y;
        y=temp;
        System.out.println("x="+x+" y="+y);
    }

    public static void main(String args[])
    {
        method_over o=new method_over();
        o.get();
        o.get(1);
        o.get(2,4);

    }
    
}
