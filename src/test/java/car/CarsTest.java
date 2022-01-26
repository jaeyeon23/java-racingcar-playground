package car;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CarsTest {
    @Test
    void pickWinner() {
        // given
        Car steve = new Car(new Name("Steve"), 2);
        Car tom = new Car(new Name("Tom"), 3);
        Car eric = new Car(new Name("Eric"), 4);
        List<Car> carList = Arrays.asList(steve, tom, eric);
        Cars cars = new Cars(carList);
        // when
        List<Car> winnerList = cars.pickWinner();
        // then
        assertThat(winnerList).containsExactly(eric);
    }
}
