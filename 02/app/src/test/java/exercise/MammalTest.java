package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MammalTest {
    private Mammal mammal1;
    private Mammal mammal2;
    private Mammal mammal3;

    private class TestMammal extends Mammal {
        public TestMammal(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            // Implementation not necessary for this test
        }
    }

    @Before
    public void setUp() {
        mammal1 = new TestMammal("Mammal1");
        mammal2 = new TestMammal("Mammal1");
        mammal3 = new TestMammal("Mammal2");
    }

    @Test
    public void testGetName() {
        assertEquals("Mammal1", mammal1.getName());
        assertEquals("Mammal2", mammal3.getName());
    }

    @Test
    public void testToString() {
        assertEquals("Mammal{name='Mammal1'}", mammal1.toString());
        assertEquals("Mammal{name='Mammal2'}", mammal3.toString());
    }

    @Test
    public void testEquals_Symmetric() {
        assertTrue(mammal1.equals(mammal2) && mammal2.equals(mammal1));
        assertFalse(mammal1.equals(mammal3));
    }

    @Test
    public void testHashCode() {
        assertEquals(mammal1.hashCode(), mammal2.hashCode());
        assertNotEquals(mammal1.hashCode(), mammal3.hashCode());
    }
}
