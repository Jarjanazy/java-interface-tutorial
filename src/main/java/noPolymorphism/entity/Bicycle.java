package noPolymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bicycle {
    private final int Id;

    public void goForward(){
        System.out.println("Bike forward");
    }
    public void goBackward(){
        System.out.println("Bike backward");
    }
}
