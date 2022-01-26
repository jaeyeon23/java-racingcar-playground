package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PositionTest {
    @Test
    void create() {
        // given
        Position position = new Position(0);
        // then
        assertThat(position).isEqualTo(new Position());
    }

    @Test
    void move() {
        // given
        Position position = new Position(0);
        // when
        position.move();
        // then
        assertThat(position).isEqualTo(new Position(1));
    }
}
