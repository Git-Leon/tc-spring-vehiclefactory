package io.zipcoder.tc_spring_personfactory_application.domain.bike;

import io.zipcoder.tc_spring_personfactory_application.domain.VehicleMake;

/**
 * Created by leon on 8/16/17.
 * This class must generate objects of type Bike whose vehicle-make is Yamaha
 */
public final class RandomYamahaBikeFactory extends AbstractRandomBikeFactory {
    public Bike create() {
        return super.createMake(VehicleMake.YAMAHA);
    }
}