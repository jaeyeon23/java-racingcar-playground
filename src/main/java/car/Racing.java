package car;

import java.util.List;
import java.util.Random;

public class Racing {
    private static final int MAX_NUMBER = 10;

    private Cars cars;
    private int count;

    public Racing(Cars cars, int count) {
        if (count < 1) {
            throw new IllegalArgumentException("count는 1보다 작을 수 없습니다.");
        }
        this.cars = cars;
        this.count = count;
    }

    public List<Car> play() {
        for (int i = 0; i < count; i++) {
            randomPlay();
        }
        return cars.pickWinner();
    }

    private void randomPlay() {
        for (Car car : cars.getCars()) {
            car.move(getRandomNum());
        }
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER);
    }
}
