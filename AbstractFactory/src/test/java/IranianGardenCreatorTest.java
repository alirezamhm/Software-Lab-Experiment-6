import org.junit.Test;

import static org.junit.Assert.*;

public class IranianGardenCreatorTest {

    @Test
    public void createTree() {
        AbstractGardenCreator garden = new IranianGardenCreator();
        assertEquals("Chenar", garden.createTree().getName());
    }

    @Test
    public void createFlower() {
        AbstractGardenCreator garden = new IranianGardenCreator();
        assertEquals("Mikhak", garden.createFlower().getName());
    }
}