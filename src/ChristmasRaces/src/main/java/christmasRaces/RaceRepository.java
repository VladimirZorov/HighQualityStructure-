package ChristmasRaces.src.main.java.christmasRaces;

import ChristmasRaces.src.main.java.christmasRaces.entities.races.Race;
import ChristmasRaces.src.main.java.christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;

public class RaceRepository implements Repository<Race> {
    @Override
    public Race getByName(String name) {
        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return null;
    }

    @Override
    public void add(Race model) {

    }

    @Override
    public boolean remove(Race model) {
        return false;
    }
}
