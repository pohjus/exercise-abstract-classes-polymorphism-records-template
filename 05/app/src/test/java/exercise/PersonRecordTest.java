package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonRecordTest {

    @Test
    public void testConstructorWithValidName() {
        // Test the constructor with a valid name
        PersonRecord person = new PersonRecord("John");
        assertEquals("John", person.name());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullName() {
        // Test if the constructor throws NullPointerException with a null name
        new PersonRecord(null);
    }

    @Test
    public void testEqualsAndHashCode() {
        // Test the equals() and hashCode() methods
        PersonRecord person1 = new PersonRecord("Alice");
        PersonRecord person2 = new PersonRecord("Alice");
        PersonRecord person3 = new PersonRecord("Bob");

        assertTrue(person1.equals(person2));
        assertTrue(person2.equals(person1));
        assertFalse(person1.equals(person3));
        assertFalse(person3.equals(person1));
        assertEquals(person1.hashCode(), person2.hashCode());
    }

    @Test
    public void testToString() {
        // Test the toString() method
        PersonRecord person = new PersonRecord("Charlie");
        System.out.println(person);
        assertEquals("PersonRecord[name=Charlie]", person.toString());
    }
}
