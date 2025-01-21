public class met_over {
    int a,b,c;
    void get()
    {
        System.out.println("First method");
        a=10;
        b=20;
        c=a+b;
        System.out.println("add="+c);
    }
    void get(String x)
    {
        System.out.println("Second method");
    
        System.out.println("name="+x);
    }
    void get(float x,float y)
    { 
        System.out.println("Third method");
        float a,b,c;
        a=x;
        b=y;
        c=a+b;
        System.out.println("add="+c);
    }
    public static void main(String[] args) {
        met_over o=new met_over();
        o.get();
        o.get("Bapa");
        o.get(30.5f,40.5f);
    }
    
}
