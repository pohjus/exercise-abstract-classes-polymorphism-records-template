package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonClassTest {

    @Test
    public void testConstructor() {
        // Test the constructor and name getter
        String testName = "John";
        PersonClass person = new PersonClass(testName);
        assertEquals(testName, person.name());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName() {
        // Test if the constructor throws NullPointerException with a null name
        new PersonClass(null);
    }

    @Test
    public void testEqualsAndHashCode() {
        // Test the equals() and hashCode() methods
        PersonClass person1 = new PersonClass("Alice");
        PersonClass person2 = new PersonClass("Alice");
        PersonClass person3 = new PersonClass("Bob");

        assertTrue(person1.equals(person2));
        assertTrue(person2.equals(person1));
        assertFalse(person1.equals(person3));
        assertFalse(person3.equals(person1));
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testToString() {
        // Test the toString() method
        PersonClass person = new PersonClass("Charlie");
        assertEquals("PersonClass[name=Charlie]", person.toString());
    }
}
