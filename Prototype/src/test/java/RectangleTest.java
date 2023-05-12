import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testEquals() {
        Rectangle rectangle1 = new Rectangle(1, 2, "blue", 10, 20);
        Rectangle rectangle2 = new Rectangle(1, 2, "blue", 10, 20);
        assertEquals(rectangle1, rectangle2);
    }

    @Test
    public void testClone() {
        Rectangle rectangle = new Rectangle(1, 2, "blue", 10, 20);
        assertEquals(rectangle, rectangle.clone());
    }
}