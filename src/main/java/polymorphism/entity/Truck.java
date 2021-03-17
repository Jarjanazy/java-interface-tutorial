package polymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Truck implements Vehicle{
    private final int id;
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
