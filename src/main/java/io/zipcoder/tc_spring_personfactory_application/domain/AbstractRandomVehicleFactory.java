package io.zipcoder.tc_spring_personfactory_application.domain;

import io.zipcoder.tc_spring_personfactory_application.utilities.RandomUtils;
import io.zipcoder.tc_spring_personfactory_application.utilities.AbstractRandomEntityFactory;

/**
 * Created by leon on 8/16/17.
 * Subclass of this class must generate objects of type Vehicle
 */
abstract public class AbstractRandomVehicleFactory<E extends Vehicle> extends AbstractRandomEntityFactory<E> {
    abstract public E createMake(String make);
    public final E createMake(VehicleMake make) {
        return createMake(make.name());
    }

    public E create() {
        VehicleMake randomMake = VehicleMake.getRandom();
        return createMake(randomMake);
    }
}
