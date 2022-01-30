package car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> pickWinners() throws NoSuchFieldException {
        int maxPosition = getMaxPosition();
        return carList.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    private int getMaxPosition() throws NoSuchFieldException {
        return carList.stream()
                .max(Comparator.comparing(Car::getPosition))
                .orElseThrow(NoSuchFieldException::new)
                .getPosition();
    }
}
