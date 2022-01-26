package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    void move() {
        // given
        Car car = new Car(new Name("Steve"));
        // when
        car.move(4);
        // then
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
}
