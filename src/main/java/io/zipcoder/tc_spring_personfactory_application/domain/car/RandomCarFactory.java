package io.zipcoder.tc_spring_personfactory_application.domain.car;

import io.zipcoder.tc_spring_personfactory_application.domain.AbstractRandomVehicleFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.VehicleMake;
import io.zipcoder.tc_spring_personfactory_application.utilities.RandomUtils;

/**
 * Created by leon on 8/16/17.
 */
abstract public class RandomCarFactory extends AbstractRandomVehicleFactory<Car> {
    public Car createMake(VehicleMake make) {
        return createMake(make.name());
    }

    public Car createMake(String make) {
        String randomModel = RandomUtils.createString('a', 'z', 10);
        Boolean hybridFlag = RandomUtils.createBoolean(50);
        return new Car(make,randomModel, hybridFlag);
    }
}

