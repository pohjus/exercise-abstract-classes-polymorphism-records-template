package exercise.mammals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanTest {
    private Human human1;
    private Human human2;
    private Human human3;

    @Before
    public void setUp() {
        human1 = new Human("Alice");
        human2 = new Human("Alice");
        human3 = new Human("Bob");
    }

    @Test
    public void testCreateArt() {
        // As with Dog's makeSound, this is more of a placeholder
        // If the method evolves to return a value or have testable behavior,
        // then you can assert the expected behavior here.
    }

    @Test
    public void testMakeSound() {
        // This test is also a placeholder as makeSound only logs a message.
        // If makeSound is changed to return a value or have a testable effect,
        // you would perform assertions here.
    }

    @Test
    public void testToString() {
        assertEquals("Human{name='Alice'}", human1.toString());
        assertEquals("Human{name='Bob'}", human3.toString());
    }

    @Test
    public void testEquals_Symmetric() {
        assertTrue(human1.equals(human2) && human2.equals(human1));
        assertFalse(human1.equals(human3));
    }

    @Test
    public void testHashCode() {
        assertEquals(human1.hashCode(), human2.hashCode());
        assertNotEquals(human1.hashCode(), human3.hashCode());
    }
}
