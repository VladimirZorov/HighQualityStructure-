package ChristmasRaces.src.main.java.christmasRaces.entities.drivers;

import ChristmasRaces.src.main.java.christmasRaces.entities.cars.Car;

public interface Driver {
    String getName();

    Car getCar();

    int getNumberOfWins();

    void addCar(Car car);

    void winRace();

    boolean getCanParticipate();
}
