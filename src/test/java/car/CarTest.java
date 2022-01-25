package car;

import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Tobi");
        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
