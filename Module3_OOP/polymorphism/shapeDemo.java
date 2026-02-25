package Module3_OOP.polymorphism;
class Shape {

    void draw() {
        System.out.println("drawing shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("drawing circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("drawing rectangle");
    }
}

public class shapeDemo {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}

  

