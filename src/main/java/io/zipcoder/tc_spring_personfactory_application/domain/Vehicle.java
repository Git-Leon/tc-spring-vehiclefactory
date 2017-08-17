package io.zipcoder.tc_spring_personfactory_application.domain;

import javax.persistence.*;

/**
 * Created by leon on 8/14/17.
 */
@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    @Column(name = "VEHICLE_ID")
    private long id;

    @Column(name = "VEHICLE_IS_HYBRID")
    private boolean isHybrid;

    @Column(name = "VEHICLE_NUMBER_OF_WHEELS")
    private int numberOfWheels;

    @Column(name = "VEHICLE_MODEL")
    private String model;

    @Column(name = "VEHICLE_MAKE")
    private String make;

    protected Vehicle(String make, String model, int numberOfWheels, boolean isHybrid) {
        // This constructor is used by the VehicleBuilder
        this.make = make;
        this.model = model;
        this.isHybrid = isHybrid;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle() {
        // This constructor is used by spring
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}