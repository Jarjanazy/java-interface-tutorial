package noPolymorphism.service;

import noPolymorphism.entity.Bicycle;
import noPolymorphism.entity.Car;
import noPolymorphism.entity.Truck;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TrafficService {
    private List<Bicycle> getBicyclesFromMap(){
        return Arrays.asList(new Bicycle(1), new Bicycle(2));
    }
    private List<Car> getCarsFromMap(){
        return Arrays.asList(new Car(1), new Car(2));
    }
    private List<Truck> getTrucksFromMap(){
        return Arrays.asList(new Truck(1), new Truck(2));
    }

    public void goForward(List<Bicycle> bicycles, List<Car> cars, List<Truck> trucks){
        bicycles.forEach(Bicycle::goForward);
        cars.forEach(Car::goForward);
        trucks.forEach(Truck::goForward);
    }

    public void checkEngine(List<Car> cars, List<Truck> trucks){
        cars.forEach(Car::checkEngine);
        trucks.forEach(Truck::checkEngine);
    }

    public void makeAllTransportGoForward(){
        goForward(getBicyclesFromMap(), getCarsFromMap(), getTrucksFromMap());
    }
    public void makeAllEnginesStart(){
        checkEngine(getCarsFromMap(), getTrucksFromMap());
    }
}
