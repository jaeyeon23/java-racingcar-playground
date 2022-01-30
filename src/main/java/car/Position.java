package car;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        if (position < 1) {
            throw new IllegalArgumentException("0이하의 position은 존재할 수 없습니다.");
        }
        this.position = position;
    }

    public void addPosition() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}