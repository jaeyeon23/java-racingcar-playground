package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {
    @Test
    void create() {
        Position position = new Position(1);
        assertThat(position).isEqualTo(new Position(1));
    }

    @Test
    void valid() {
        assertThatThrownBy(() -> {
            new Position(0);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
