package car;

import java.util.Random;

public class CarRacing {
    public void play(Cars cars, int count) {
        for (int i = 0; i < count; i++) {
            play(cars);
        }
    }

    public void play(Cars cars) {
        for (Car car : cars.getCarList()) {
            checkPlusNum(car);
        }
    }

    public void checkPlusNum(Car car) {
        if (new Random().nextInt(10) >= 4) {
            car.plusNum();
        }
    }
}
