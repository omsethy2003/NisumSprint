abstract class Animal1 {
    String name;

    public Animal1(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Q30AbstractClass {
    public static void main(String[] args) {
        Animal1 dog = new Dog1("Buddy");
        dog.displayName();
        dog.makeSound();
    }
}

