class Vehicle {
    String type;
    int wheels;

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    Car() {
        type = "Car";
        wheels = 4;
    }
}
public class Q14Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
