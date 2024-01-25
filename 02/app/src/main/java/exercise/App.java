package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exercise.mammals.Dog;
import exercise.mammals.Human;
import exercise.util.Polymorphism;

/**
 * Exercise 01.
 *
 *  @author Pohjolainen Jussi
 */
public final class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

    private App() {
        // Utility class, no instantiation required
    }

    /**
     * The main method that serves as the entry point for the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        // error: Mammal is abstract; cannot be instantiated
        // new Mammal();

        Dog spot = new Dog("Spot");
        LOG.info("Dog's name is " + spot.getName() + ".");
        spot.giveBirthToLivingChild();
        spot.sniffButt();

        Human tina = new Human("Tina");
        LOG.info("Humans's name is " + tina.getName() + ".");
        tina.giveBirthToLivingChild();
        tina.createArt();

        tina.makeSound();
        spot.makeSound();

        Polymorphism.invokeMethods1(spot);
        Polymorphism.invokeMethods1(tina);

        Polymorphism.invokeMethods2(tina);

        Polymorphism.invokeMethods3(tina);
        Polymorphism.invokeMethods3(spot);
        Polymorphism.invokeMethods3("hello");
        Polymorphism.invokeMethods4(tina);
        Polymorphism.invokeMethods4(spot);

    }


}
