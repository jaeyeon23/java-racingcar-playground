package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    void valid() {
        assertThatThrownBy(() -> new Name("Steve Fox")).isInstanceOf(IllegalArgumentException.class);
    }
}
