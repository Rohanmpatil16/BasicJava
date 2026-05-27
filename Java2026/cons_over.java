public class cons_over {
    int a,b,c;

    cons_over()
    {
        a=20;
        b=30;
        c=a+b;
        System.out.println("The sum of a and b is "+c);
    }

    cons_over(int x,int y)
    {
        a=x;
        b=y;
        c=a+b;
        System.out.println("The sum of a and b is "+c);
    }

    public static void main(String args[])
    {
        cons_over c1=new cons_over();
        cons_over c2=new cons_over(50,60);
    }

    
}
