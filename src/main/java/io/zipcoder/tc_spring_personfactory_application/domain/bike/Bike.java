package io.zipcoder.tc_spring_personfactory_application.domain.bike;

import io.zipcoder.tc_spring_personfactory_application.domain.Vehicle;

import javax.persistence.Entity;

/**
 * Created by leon on 8/16/17.
 */
@Entity
public class Bike extends Vehicle {
    public Bike() {} // This constructor is used by Spring
    public Bike(String make, String model, boolean isHybrid) {
        super(make, model, 2, isHybrid);
    }
}
