package polymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car implements Vehicle{
    private final int id;
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
