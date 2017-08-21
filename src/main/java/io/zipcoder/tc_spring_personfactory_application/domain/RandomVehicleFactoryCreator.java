package io.zipcoder.tc_spring_personfactory_application.domain;

import io.zipcoder.tc_spring_personfactory_application.domain.bike.RandomYamahaBikeFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.car.RandomHondaCarFactory;

/**
 * Created by leon on 8/21/17.
 */
public class RandomVehicleFactoryCreator {
    public RandomHondaCarFactory createHondaCarFactory() {
        return new RandomHondaCarFactory();
    }

    public static RandomYamahaBikeFactory createYamahaBikeFactory() {
        return new RandomYamahaBikeFactory();
    }
}
