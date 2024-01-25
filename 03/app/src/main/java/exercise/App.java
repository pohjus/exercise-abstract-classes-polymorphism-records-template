package exercise;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Exercise 03.
 */
public final class App extends MammalGenerator {
    private static final Logger LOG = LogManager.getLogger(App.class);

    /**
     * Private constructor to prevent instantiation.
     */
    private App() {
    }

    /**
     * Starts an operation on the given {@link Mammal}.
     * In this implementation, it triggers the mammal to make a sound.
     *
     * @param mammal the {@link Mammal} on which the operation is performed
     */
    public void start(final Mammal mammal) {
        if (mammal == null) {
            LOG.error("Error: The mammal cannot be null.");
        } else {
            mammal.makeSound();
        }
    }

    /**
     * The main method serves as the program's entry point.
     * It creates an instance of {@code App} and initiates the launch process.
     *
     * @param args command-line arguments, used for determining
     *             the type of {@link Mammal} to generate and start
     */
    public static void main(final String[] args) {
        new App().launch(args);
    }
}
