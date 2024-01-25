package exercise.mammals;

import exercise.Mammal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MammalGeneratorTest {

    @Test
    public void testLaunchWithDogArgument() {
        MammalGenerator generator = new MammalGenerator() {
            @Override
            public void start(Mammal mammal) {
                // Test logic for the Dog case
                assertTrue(mammal instanceof Dog);
                assertEquals("Spot", ((Dog) mammal).getName());
            }
        };

        String[] args = {"Dog"};
        generator.launch(args);
    }

    @Test
    public void testLaunchWithHumanArgument() {
        MammalGenerator generator = new MammalGenerator() {
            @Override
            public void start(Mammal mammal) {
                // Test logic for the Human case
                assertTrue(mammal instanceof Human);
                assertEquals("Tina", ((Human) mammal).getName());
            }
        };

        String[] args = {"Human"};
        generator.launch(args);
    }

    @Test
    public void testLaunchWithInvalidArgument() {
        MammalGenerator generator = new MammalGenerator() {
            @Override
            public void start(Mammal mammal) {
                // Test logic for the case when an invalid argument is provided
                // For example, assert that the mammal is null
                assertEquals(null, mammal);
            }
        };

        String[] args = {"Invalid"};
        generator.launch(args);
    }

    @Test
    public void testLaunchWithNoArguments() {
        MammalGenerator generator = new MammalGenerator() {
            @Override
            public void start(Mammal mammal) {
                // Test logic for the case when no arguments are provided
                // For example, assert that the mammal is null
                assertEquals(null, mammal);
            }
        };

        String[] args = {};
        generator.launch(args);
    }
}