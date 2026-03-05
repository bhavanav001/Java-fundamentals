
class Student {
    int roll;
    String name;
    static String college = "BC College";

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    static void changeCollege() {
        college = "SAP College";
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class Staticmeth {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "bhavs");
        Student s2 = new Student(2, "anu");

        s1.display();
        s2.display();
    }
}
