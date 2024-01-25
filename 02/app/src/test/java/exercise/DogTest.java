package exercise.mammals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;

    @Before
    public void setUp() {
        dog1 = new Dog("Buddy");
        dog2 = new Dog("Buddy");
        dog3 = new Dog("Max");
    }

    @Test
    public void testMakeSound() {
        // Assuming LOG.info prints the name and sound to console,
        // you can mock the logger and verify the output,
        // or if the method evolves to return a value, test it like:
        // assertEquals("Buddy Barks!", dog1.makeSound());
    }

    @Test
    public void testToString() {
        assertEquals("Dog{name='Buddy'}", dog1.toString());
        assertEquals("Dog{name='Max'}", dog3.toString());
    }

    @Test
    public void testEquals_Symmetric() {
        assertTrue(dog1.equals(dog2) && dog2.equals(dog1));
        assertFalse(dog1.equals(dog3));
    }

    @Test
    public void testHashCode() {
        assertEquals(dog1.hashCode(), dog2.hashCode());
        assertNotEquals(dog1.hashCode(), dog3.hashCode());
    }
}
