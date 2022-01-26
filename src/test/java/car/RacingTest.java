package car;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RacingTest {
    @Test
    void create() {
        // given
        Car steve = new Car(new Name("Steve"));
        Car tom = new Car(new Name("Tom"));
        Car eric = new Car(new Name("Eric"));
        Cars cars = new Cars(Arrays.asList(steve, tom, eric));
        Racing racing = new Racing(cars, 9);
        // when
        List<Car> winnerList = racing.play();
        // then
        System.out.println(winnerList);
    }
}
