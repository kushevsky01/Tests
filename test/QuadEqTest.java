import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadEqTest {

    @Test
    void roots() {
        QuadEq eq = new QuadEq();
//        eq.roots(1,-3,-4);
        assertEquals(3, eq.roots(1,-6,9) );
        assertEquals(3, eq.roots(1,-3,-4) );
        assertEquals('!', eq.roots(5,2,3) );
    }
}