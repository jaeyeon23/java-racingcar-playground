package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(String cars) throws Exception {
        List<Car> carList = new ArrayList<>();
        String[] tokens = cars.split(",");
        for (String token : tokens) {
            carList.add(new Car(token));
        }
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carList=" + carList +
                '}';
    }
}
