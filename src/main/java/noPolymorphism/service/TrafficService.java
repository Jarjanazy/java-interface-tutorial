package noPolymorphism.service;

import noPolymorphism.entity.Bicycle;

import java.util.Arrays;
import java.util.List;

public class TrafficService {
    private List<Bicycle> getBicyclesFromMap(){
        return Arrays.asList(new Bicycle(1), new Bicycle(2));
    }


}
