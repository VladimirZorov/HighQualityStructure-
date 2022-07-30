package ChristmasRaces.src.main.java.christmasRaces;

import ChristmasRaces.src.main.java.christmasRaces.entities.cars.Car;
import ChristmasRaces.src.main.java.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;

public class CarRepository implements Repository<Car> {
    @Override
    public Car getByName(String name) {
        return null;
    }

    @Override
    public Collection<Car> getAll() {
        return null;
    }

    @Override
    public void add(Car model) {

    }

    @Override
    public boolean remove(Car model) {
        return false;
    }
}
