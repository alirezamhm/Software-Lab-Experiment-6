import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    @Test
    public void constructSportsCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        assertEquals(CarType.SPORTS_CAR, car.getCarType());
        assertEquals(2, car.getSeats());
        assertEquals(3.0, car.getEngine().getVolume(), 0.01);
        assertEquals(0.0, car.getEngine().getMileage(), 0.01);
    }

    @Test
    public void constructCityCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car car = builder.getResult();
        assertEquals(CarType.CITY_CAR, car.getCarType());
        assertEquals(2, car.getSeats());
        assertEquals(1.2, car.getEngine().getVolume(), 0.01);
        assertEquals(0.0, car.getEngine().getMileage(), 0.01);
    }

    @Test
    public void constructSUV() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);
        Car car = builder.getResult();
        assertEquals(CarType.SUV, car.getCarType());
        assertEquals(4, car.getSeats());
        assertEquals(2.5, car.getEngine().getVolume(), 0.01);
        assertEquals(0.0, car.getEngine().getMileage(), 0.01);
    }
}