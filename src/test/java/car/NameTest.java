package car;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class NameTest {
    @Test
    void createException() {
        assertThatThrownBy(() -> {
            new Name("Wakajaki");
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
