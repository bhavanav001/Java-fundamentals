package module2_methods_runtime;

public class Student {
    String name;
    int roll;

    // default constructor
    Student() {
        name = "unknown";
        roll = 0;
    }

    // parameterized constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("roll: " + roll);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("bhavs", 01);

        System.out.println("default constructor:");
        s1.display();

        System.out.println("parameterized constructor:");
        s2.display();
    }
}
  

