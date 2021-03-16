package polymorphism.entity;

public class Car implements Vehicle{

    public void checkEngine() {
        System.out.println("Checking Car engine");
    }

    public void goForward() {
        System.out.println("Car forward");
    }

    public void goBackward() {
        System.out.println("Car backward");
    }
}
