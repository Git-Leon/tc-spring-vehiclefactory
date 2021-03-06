package io.zipcoder.tc_spring_personfactory_application.domain.bike;

import io.zipcoder.tc_spring_personfactory_application.domain.AbstractRandomVehicleFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.VehicleMake;
import io.zipcoder.tc_spring_personfactory_application.utilities.RandomUtils;

/**
 * Created by leon on 8/16/17.
 * Subclass of this class must generate objects of type Bike
 */
abstract public class AbstractRandomBikeFactory extends AbstractRandomVehicleFactory<Bike> {
    public Bike createMake(String make) {
        String randomModel = RandomUtils.createString('a', 'z', 10);
        Boolean hybridFlag = RandomUtils.createBoolean(50);
        return new Bike(make, randomModel, hybridFlag);
    }
}