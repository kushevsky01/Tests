import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void sum() {
        Calculate cal = new Calculate();
        assertEquals(6, cal.sum(5, 1.1));
    }

    @Test
    void sub() {
        Calculate cal = new Calculate();
        assertEquals(3.8, cal.sub(5, 1.2));
    }

    @Test
    void mul() {
        Calculate cal = new Calculate();
        assertEquals(6, cal.mul(5, 1.2));
    }

    @Test
    void div() {
        Calculate cal = new Calculate();
        assertEquals(6.1, cal.div(30.5, 5));
    }
}