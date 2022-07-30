package ChristmasRaces.src.main.java.christmasRaces.io;

import ChristmasRaces.src.main.java.christmasRaces.io.interfaces.OutputWriter;


public class ConsoleWriter implements OutputWriter {
    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
