public class static_opr{
    static int a;
    static_opr()
    {
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        static_opr obj1 = new static_opr();
        static_opr obj2 = new static_opr();
        static_opr obj3 = new static_opr();
    }
}
