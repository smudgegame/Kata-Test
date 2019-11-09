import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoopTest {
    @Test
    public void simpleTest() {
        Coop coop = new Coop();
        assertEquals(23, coop.getNumber());
    }

}
