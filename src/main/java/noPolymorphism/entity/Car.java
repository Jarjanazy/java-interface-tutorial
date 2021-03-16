package noPolymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private final int Id;

    public void goForward(){
        System.out.println("Car forward");
    }
    public void goBackward(){
        System.out.println("Car backward");
    }
    public void checkEngine(){
        System.out.println("Checking Car engine");
    }
}
