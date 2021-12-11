package spaceStation.models.astronauts;

public class Geodesist extends BaseAstronaut{
    private final static double OXYGEN_VALUE = 50;


    public Geodesist(String name) {
        super(name, OXYGEN_VALUE);
    }

}
