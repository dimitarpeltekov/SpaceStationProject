package spaceStation;

import spaceStation.core.Controller;
import spaceStation.core.ControllerImpl;
import spaceStation.core.Engine;
import spaceStation.core.EngineImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();



    }
}
