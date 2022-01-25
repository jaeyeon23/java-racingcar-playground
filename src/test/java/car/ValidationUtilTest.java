package car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilTest {
    private ValidationUtil validationUtil;

    @BeforeEach
    void setUp() {
        validationUtil = new ValidationUtil();
    }

    @Test
    @DisplayName("자동차 이름 5자 미만")
    void isLength() {
        assertThat(validationUtil.isLength("Tom")).isTrue();
        assertThat(validationUtil.isLength("Jaeyeon")).isFalse();
    }
}
