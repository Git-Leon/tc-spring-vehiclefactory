package io.zipcoder.tc_spring_personfactory_application.controller;

import io.zipcoder.tc_spring_personfactory_application.domain.AbstractRandomVehicleFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.Vehicle;
import io.zipcoder.tc_spring_personfactory_application.domain.bike.RandomYamahaBikeFactory;
import io.zipcoder.tc_spring_personfactory_application.domain.car.RandomHondaCarFactory;
import io.zipcoder.tc_spring_personfactory_application.repository.VehicleRepository;
import io.zipcoder.tc_spring_personfactory_application.utilities.AbstractRandomEntityFactory;
import io.zipcoder.tc_spring_personfactory_application.utilities.RandomVehicleFactoryLookUp;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import java.net.URI;

/**
 * Created by leon on 8/14/17.
 */
@RestController
@RequestMapping(value = "/vehicleFactory")
public class VehicleFactoryController {
    @Inject
    private VehicleRepository vehicleRepository;

    @Inject
    private RandomVehicleFactoryLookUp factoryLookup;

    @PostMapping
    public ResponseEntity<?> createRandomVehicle(@RequestParam(value="vehicleMaker") String vehicleMaker) {
        AbstractRandomVehicleFactory arvFactory = factoryLookup.get(vehicleMaker);
        Vehicle vehicle = arvFactory.create();

        HttpHeaders headers = new HttpHeaders();
        URI vehicleUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(vehicle.getId())
                .toUri();
        headers.setLocation(vehicleUri);

        vehicleRepository.save(vehicle);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
