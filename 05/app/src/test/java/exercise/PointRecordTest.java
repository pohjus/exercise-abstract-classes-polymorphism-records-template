package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class PointRecordTest {

    @Test
    public void testConstructorWithPositiveCoordinates() {
        // Test the constructor with positive coordinates
        PointRecord point = new PointRecord(2, 3);
        assertEquals(2, point.x());
        assertEquals(3, point.y());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeXCoordinate() {
        // Test if the constructor throws IllegalArgumentException with a negative x-coordinate
        new PointRecord(-1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeYCoordinate() {
        // Test if the constructor throws IllegalArgumentException with a negative y-coordinate
        new PointRecord(2, -3);
    }

    @Test
    public void testDefaultConstructor() {
        // Test the default constructor
        PointRecord point = new PointRecord();
        assertEquals(0, point.x());
        assertEquals(0, point.y());
    }

    @Test
    public void testDistanceTo() {
        // Test the distanceTo() method
        PointRecord point1 = new PointRecord(1, 2);
        PointRecord point2 = new PointRecord(4, 6);
        double distance = point1.distanceTo(point2);
        assertEquals(5.0, distance, 0.001);
    }

    @Test
    public void testToString() {
        // Test the toString() method
        PointRecord point = new PointRecord(3, 5);
        assertEquals("PointRecord[x=3, y=5]", point.toString());
    }
}
