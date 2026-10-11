public class cons_student {
    int age;
    String name;

    cons_student(String n,int a)
    {
        name=n;
        age=a;
    }

    public void dis()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String args[])
    {
        cons_student o=new cons_student("John",20);
        o.dis();
    }
    
}
