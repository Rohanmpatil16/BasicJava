public class this_key {
    int a,b,c;
    void get(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void dis()
    {
        c=a+b;
        System.out.println("Addition is="+c);
    }
    public static void main(String[] args) {
        this_key o=new this_key();
        o.get(10,20);
        o.dis();
    }
}
