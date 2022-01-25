package car;

import java.util.Random;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private String name;
    private int position;

    public Car(String name) {
        ValidationUtil validationUtil = new ValidationUtil();
        if (validationUtil.isLength(name)) {
            this.name = name;
        }
    }

    public void move() {
        if (getRandomNum() >= FORWARD_NUM) {
            this.position++;
        }
    }

    public int getRandomNum() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }

    public int getPosition() {
        return position;
    }
}
