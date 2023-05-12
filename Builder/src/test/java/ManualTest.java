import org.junit.Test;

import static org.junit.Assert.*;

public class ManualTest {

    @Test
    public void print() {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        assertEquals("Type of car: SPORTS_CAR\n" +
                "Count of seats: 2\n" +
                "Engine: volume - 3.0; mileage - 0.0\n",
                carManual.print());
    }
}