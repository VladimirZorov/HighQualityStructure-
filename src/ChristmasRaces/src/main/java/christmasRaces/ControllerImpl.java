package ChristmasRaces.src.main.java.christmasRaces;

import ChristmasRaces.src.main.java.christmasRaces.core.interfaces.Controller;
import ChristmasRaces.src.main.java.christmasRaces.entities.cars.Car;
import ChristmasRaces.src.main.java.christmasRaces.entities.drivers.Driver;
import ChristmasRaces.src.main.java.christmasRaces.entities.races.Race;
import ChristmasRaces.src.main.java.christmasRaces.repositories.interfaces.Repository;

public class ControllerImpl implements Controller {
    public ControllerImpl(Repository<Driver> driverRepository, Repository<Car> carRepository, Repository<Race> raceRepository) {
    }

    @Override
    public String createDriver(String driver) {
        return null;
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        return null;
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {
        return null;
    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {
        return null;
    }

    @Override
    public String startRace(String raceName) {
        return null;
    }

    @Override
    public String createRace(String name, int laps) {
        return null;
    }
}
