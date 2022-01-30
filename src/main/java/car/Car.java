package car;

public class Car {
    private final Name name;
    private Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void move(int randomNum) {
        if (randomNum >= 4) {
            position.addPosition();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }
}
