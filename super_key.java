public class super_key {
    int a=20;

    public static void main(String[] args) {
        b o=new b();
        o.show();
    }
    
}
class b extends super_key
{
    void show()
    {
        int a=10;
        System.out.println("a="+a);
        System.out.println(super.a);
    }
}
