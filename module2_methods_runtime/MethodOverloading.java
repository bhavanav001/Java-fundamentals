package module2_methods_runtime;

public class MethodOverloading {


    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println("sum of 2 int: " + obj.add(10, 20));
        System.out.println("sum of 3 int: " + obj.add(10, 20, 30));
        System.out.println("sum of 2 double: " + obj.add(5.5, 4.5));
    }
}
  

