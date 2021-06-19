package net.codetojoy.waro.strategy;

import org.junit.jupiter.api.Test
import static org.junit.Assert.*

public class StrategiesCardTest {
    def strategies = new Strategies()

    @Test
    public void testMaxCard() {
        // test
        def result = strategies.getStrategy(Strategies.MAX)

        assertTrue(result instanceof MaxCard)
    }

    @Test
    public void testMinCard() {
        // test
        def result = strategies.getStrategy(Strategies.MIN)

        assertTrue(result instanceof MinCard)
    }

    @Test
    public void testNearestCard() {
        // test
        def result = strategies.getStrategy(Strategies.NEAREST)

        assertTrue(result instanceof NearestCard)
    }

    @Test
    public void testNextCard() {
        // test
        def result = strategies.getStrategy(Strategies.NEXT)

        assertTrue(result instanceof NextCard)
    }

    @Test
    public void testBogus() {
        assertThrows(IllegalArgumentException.class, {
            // test
            strategies.getStrategy("bogus")
        })
    }
}
