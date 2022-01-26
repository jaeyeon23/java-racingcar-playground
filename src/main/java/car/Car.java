package car;

import java.util.List;

public class Car {
    private Name name;
    private Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position();
    }

    public Car(Name name, int position) {
        this.name = name;
        this.position = new Position(position);
    }

    public void move(int randomNum) {
        if (randomNum >= 4) {
            position.move();
        }
    }

    public Position getPosition() {
        return position;
    }

    public int getMaxPosition(int maxNumber) {
        if (position.getPositionNum() > maxNumber) {
            return position.getPositionNum();
        }
        return maxNumber;
    }

    public void isWinner(List<Car> winnerList, int maxNumber) {
        if (position.getPositionNum() == maxNumber) {
            winnerList.add(this);
        }
    }
}
