package io.zipcoder.tc_spring_personfactory_application.domain.car;

import io.zipcoder.tc_spring_personfactory_application.domain.Vehicle;

import javax.persistence.Entity;

/**
 * Created by leon on 8/16/17.
 */
@Entity
public class Car extends Vehicle {
    public Car() {}
    public Car(String make, String model, boolean isHybrid) {
        super(make, model, 4, isHybrid);
    }
}
