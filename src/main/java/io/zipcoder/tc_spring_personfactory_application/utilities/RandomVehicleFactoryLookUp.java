package io.zipcoder.tc_spring_personfactory_application.utilities;

import io.zipcoder.tc_spring_personfactory_application.domain.AbstractRandomVehicleFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.bike.RandomYamahaBikeFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.car.RandomHondaCarFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by leon on 8/16/17.
 */
@Service
public final class RandomVehicleFactoryLookUp {
    private HashMap<String, AbstractRandomVehicleFactory> map = new HashMap<>();

    public RandomVehicleFactoryLookUp() {
        addToMap(new RandomHondaCarFactory(), new RandomYamahaBikeFactory());
    }


    public AbstractRandomVehicleFactory get(String simpleClassName) {
        AbstractRandomVehicleFactory arvFactory = map.get(simpleClassName);
        if(arvFactory == null) {
            String errorMessage = "Could not find a factory with the name '%s'.";
            throw new IllegalArgumentException(String.format(errorMessage, simpleClassName));
        }
        return arvFactory;
    }

    private void addToMap(AbstractRandomVehicleFactory... factories) {
        for(AbstractRandomVehicleFactory factory : factories) {
            map.put(factory.getClass().getSimpleName(), factory);
        }
    }
}
