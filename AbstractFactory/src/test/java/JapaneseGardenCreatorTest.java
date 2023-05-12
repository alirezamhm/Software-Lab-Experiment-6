import org.junit.Test;

import static org.junit.Assert.*;

public class JapaneseGardenCreatorTest {

    @Test
    public void createTree() {
        AbstractGardenCreator garden = new JapaneseGardenCreator();
        assertEquals("Sakura", garden.createTree().getName());
    }

    @Test
    public void createFlower() {
        AbstractGardenCreator garden = new JapaneseGardenCreator();
        assertEquals("Ume", garden.createFlower().getName());
    }
}