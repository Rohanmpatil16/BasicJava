public class student {
    
        int age,marks;

        public void a()
        {
            marks=10;
            System.out.println("marks:"+marks);
        }
        public void b()
        {
            age=20;
            System.out.println("age:"+age);
        }
        public static void main(String args[])
    {
        student s=new student();
        s.b();
        s.a();
    }

}
