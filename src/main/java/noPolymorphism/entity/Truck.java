package noPolymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Truck {
    private final int Id;

    public void goForward(){
        System.out.println("Truck forward");
    }
    public void goBackward(){
        System.out.println("Truck backward");
    }
    public void checkEngine(){
        System.out.println("Checking Truck engine");
    }
}
