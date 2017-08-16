package io.zipcoder.tc_spring_personfactory_application.domain.bike;

/**
 * Created by leon on 8/16/17.
 */
public class RandomYamahaBikeFactory extends RandomBikeFactory {
    public Bike create() {
        return super.createMake("Yamaha");
    }
}