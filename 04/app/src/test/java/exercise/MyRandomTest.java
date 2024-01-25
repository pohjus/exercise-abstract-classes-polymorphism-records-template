package exercise.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyRandomTest {

    @Test
    public void testGenerateRandomIntWithinRange() {
        int min = 1;
        int max = 10;

        int randomNum = MyRandom.generateRandomInt(min, max);

        assertTrue(randomNum >= min);
        assertTrue(randomNum <= max);
    }

    @Test
    public void testGenerateRandomIntWithEqualMinMax() {
        int min = 5;
        int max = 5;

        int randomNum = MyRandom.generateRandomInt(min, max);

        assertEquals(min, randomNum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateRandomIntWithInvalidRange() {
        int min = 10;
        int max = 1;

        MyRandom.generateRandomInt(min, max);
    }

    @Test
    public void testGenerateRandomIntWithNegativeRange() {
        int min = -10;
        int max = -1;

        int randomNum = MyRandom.generateRandomInt(min, max);

        assertTrue(randomNum >= min);
        assertTrue(randomNum <= max);
    }
}
