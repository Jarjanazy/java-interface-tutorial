package polymorphism.service;

import polymorphism.entity.*;
import java.util.Arrays;
import java.util.List;

public class TrafficService {
    List<Transport> getTransportFromMap(){
        return Arrays.asList(
                new Bicycle(1), new Bicycle(2),
                new Car(1), new Car(2),
                new Truck(1), new Truck(2));
    }

    List<Vehicle> getVehicleFromMap(){
        return Arrays.asList(
                new Car(1), new Car(2),
                new Truck(1), new Truck(2));
    }

    public void goForward(List<Transport> transports){
        transports.forEach(Transport::goForward);
    }

    public void checkEngine(List<Vehicle> vehicles){
        vehicles.forEach(Vehicle::checkEngine);
    }

    public void makeAllTransportGoForward(){
        goForward(getTransportFromMap());
    }
    public void makeAllEnginesStart(){
        checkEngine(getVehicleFromMap());
    }

}
