package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarRacingTest {
    private Cars cars;
    private CarRacing carRacing;

    @BeforeEach
    void setUp() {
        carRacing = new CarRacing();
    }

    @Test
    public void carRacing() throws Exception {
        cars = new Cars("pobi,crong,honux");
        carRacing.play(cars, 5);
        System.out.println(cars);
    }

    @Test
    public void carRacing_test2() throws Exception {
        cars = new Cars("abcdefg,crong,honux");
        assertThatThrownBy(() -> carRacing.play(cars))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    public void carRacing_test3() throws Exception {
        cars = new Cars("pobi,crong,honux");
        carRacing.play(cars, 5);
    }
}
