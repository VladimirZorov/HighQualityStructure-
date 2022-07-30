package ChristmasRaces.src.main.java.christmasRaces;

import ChristmasRaces.src.main.java.christmasRaces.core.EngineImpl;
import ChristmasRaces.src.main.java.christmasRaces.core.interfaces.Controller;
import ChristmasRaces.src.main.java.christmasRaces.entities.cars.Car;
import ChristmasRaces.src.main.java.christmasRaces.entities.drivers.Driver;
import ChristmasRaces.src.main.java.christmasRaces.entities.races.Race;
import ChristmasRaces.src.main.java.christmasRaces.io.ConsoleReader;
import ChristmasRaces.src.main.java.christmasRaces.io.ConsoleWriter;
import ChristmasRaces.src.main.java.christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

        Controller controller = new ControllerImpl(driverRepository, carRepository, raceRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
