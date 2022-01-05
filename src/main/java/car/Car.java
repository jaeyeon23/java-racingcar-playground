package car;

public class Car {
    private final String name;
    private int num = 0;

    public Car(String name) {
        if (name.length() > 5) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public void plusNum() {
        this.num += 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
