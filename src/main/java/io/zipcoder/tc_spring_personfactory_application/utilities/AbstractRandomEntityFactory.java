package io.zipcoder.tc_spring_personfactory_application.utilities;

import java.util.stream.Stream;

/**
 * Created by leon on 8/14/17.
 */
public abstract class AbstractRandomEntityFactory<E> {
    abstract public E create();
    public final Stream<E> createStream(int numberOfVehicles) {
        return Stream.generate(this::create).limit(numberOfVehicles);
    }
}
