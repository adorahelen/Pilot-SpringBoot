import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class JUnitTest {
    @DisplayName("1+2 is 3")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3; // before 3

        Assertions.assertEquals(sum, a + b); // is that same?
        assertThat(a+b).isEqualTo(sum);
    }

}
