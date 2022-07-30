package ChristmasRaces.src.main.java.christmasRaces.entities.races;

import ChristmasRaces.src.main.java.christmasRaces.entities.drivers.Driver;

import java.util.Collection;

public interface Race {
    String getName();

    int getLaps();

    Collection<Driver> getDrivers();

    void addDriver(Driver driver);
}
