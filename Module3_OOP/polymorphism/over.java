package Module3_OOP.polymorphism;


class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        System.out.println("overridden method");
        return a + b;
    }
}

public class over {

    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        System.out.println(obj1.add(10, 20));
        System.out.println(obj1.add(10, 20, 30));

        Calculator obj2 = new AdvancedCalculator();
        System.out.println(obj2.add(5, 6));
    }
}

  

