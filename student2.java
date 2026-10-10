public class student2 {
    int age,marks;
    String name;
    
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("Age:"+age);
    }
    public static void main(String args[])
    {
        student2 o=new student2();
        o.name="John";
        o.marks=85;    
        o.age=20;
        o.display();

    }
}
