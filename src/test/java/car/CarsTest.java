package car;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void play() throws Exception {
        // given
        Car steve = new Car(new Name("Steve"), new Position(3));
        Car tom = new Car(new Name("Tom"), new Position(5));
        Car terry = new Car(new Name("Terry"), new Position(5));
        Cars cars = new Cars(Arrays.asList(steve, tom, terry));

        // when
        List<Car> winners = cars.pickWinners();

        // then
        assertThat(winners).containsExactlyInAnyOrder(terry, tom);
    }
}
