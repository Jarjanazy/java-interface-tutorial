package polymorphism.entity;

public class Bicycle implements Transport{

    public void goForward() {
        System.out.println("Bike forward");
    }

    public void goBackward() {
        System.out.println("Bike backward");
    }
}
