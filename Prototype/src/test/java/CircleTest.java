import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testEquals() {
        Circle circle1 = new Circle(1, 2, "red", 10);
        Circle circle2 = new Circle(1, 2, "red", 10);
        assertEquals(circle1, circle2);
    }

    @Test
    public void testClone() {
        Circle circle = new Circle(1, 2, "red", 10);
        assertEquals(circle, circle.clone());
    }
}