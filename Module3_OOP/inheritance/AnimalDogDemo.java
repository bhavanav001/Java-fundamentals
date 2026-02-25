package Module3_OOP.inheritance;
  class Animal {

    void eat() {
        System.out.println("animal eat food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("dog barks");
    }
}

public class AnimalDogDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}


