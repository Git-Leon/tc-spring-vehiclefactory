package io.zipcoder.tc_spring_personfactory_application.domain;

import io.zipcoder.tc_spring_personfactory_application.utilities.RandomUtils;

import java.util.Random;

/**
 * Created by leon on 8/16/17.
 */
public enum VehicleMake {
    HONDA,
    YAMAHA;

    public static VehicleMake getRandom() {
        return RandomUtils.selectElement(values());
    }
}
