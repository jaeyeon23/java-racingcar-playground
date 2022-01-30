package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void move() {
        Car car = new Car(new Name("Tom"), new Position(3));
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(new Position(4));
    }
}
