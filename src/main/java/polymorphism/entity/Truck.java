package polymorphism.entity;

public class Truck implements Vehicle{

    public void checkEngine() {
        System.out.println("Checking Truck engine");
    }

    public void goForward() {
        System.out.println("Truck forward");
    }

    public void goBackward() {
        System.out.println("Truck backward");
    }
}
