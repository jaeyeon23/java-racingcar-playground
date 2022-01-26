package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> pickWinner() {
        int maxNumber = getMaxNum();
        List<Car> winnerList = new ArrayList<>();
        return getWinnerList(winnerList, maxNumber);
    }

    private List<Car> getWinnerList(List<Car> winnerList, int maxNumber) {
        for (Car car : cars) {
            car.isWinner(winnerList, maxNumber);
        }
        return winnerList;
    }

    private int getMaxNum() {
        int maxNumber = 0;
        for (Car car : cars) {
            maxNumber = car.getMaxPosition(maxNumber);
        }
        return maxNumber;
    }

    public List<Car> getCars() {
        return cars;
    }
}
