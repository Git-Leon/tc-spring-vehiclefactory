package io.zipcoder.tc_spring_personfactory_application.domain.bike;

import io.zipcoder.tc_spring_personfactory_application.domain.VehicleMake;

/**
 * Created by leon on 8/16/17.
 */
public final class RandomYamahaBikeFactory extends RandomBikeFactory {
    public Bike create() {
        return super.createMake(VehicleMake.getRandom());
    }
}