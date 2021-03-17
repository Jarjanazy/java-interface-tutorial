package polymorphism.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bicycle implements Transport{
    private final int id;

    public void goForward() {
        System.out.println("Bike forward");
    }

    public void goBackward() {
        System.out.println("Bike backward");
    }
}
