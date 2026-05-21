class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student("Rohan", 20);
        Student s2 = new Student("Amit", 22);

       
        s1.display();
        s2.display();
    }
}