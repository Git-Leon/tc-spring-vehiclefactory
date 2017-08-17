package io.zipcoder.tc_spring_personfactory_application.controller;

import io.zipcoder.tc_spring_personfactory_application.domain.Vehicle;
import io.zipcoder.tc_spring_personfactory_application.repository.VehicleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by leon on 8/14/17.
 */
@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {
    @Inject
    private VehicleRepository vehicleRepository;

    @GetMapping
    public ResponseEntity<Iterable<Vehicle>> getAllVehicles() {
        Iterable<Vehicle> allVehicles = vehicleRepository.findAll();
        return new ResponseEntity<>(allVehicles, HttpStatus.OK);
    }

    @PostMapping(value="/{vehicleId}")
    public ResponseEntity<?> getVehicle(@PathVariable Long vehicleId) {
        Vehicle vehicle = vehicleRepository.findOne(vehicleId);
        return new ResponseEntity<> (vehicle, HttpStatus.OK);
    }
}
