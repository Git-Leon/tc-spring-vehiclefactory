package io.zipcoder.tc_spring_personfactory_application.domain.car;

import io.zipcoder.tc_spring_personfactory_application.domain.VehicleMake;

/**
 * Created by leon on 8/16/17.
 */
public class RandomHondaCarFactory extends RandomCarFactory {
    public Car create() {
        return super.createMake(VehicleMake.getRandom());
    }
}
