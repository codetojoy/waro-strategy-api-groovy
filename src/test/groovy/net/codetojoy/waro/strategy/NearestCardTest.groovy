package net.codetojoy.waro.strategy;

import org.junit.jupiter.api.Test
import static org.junit.Assert.*

public class NearestCardTest {
    @Test
    public void testSelectCard() {
        Strategy strategy = new NearestCard()
        int maxCard = 50
        int prizeCard = 10
        int handSize = 20
        def hand = (2..handSize).collect{ it }.minus(prizeCard)

        // test
        int result = strategy.selectCard(prizeCard, hand, maxCard)

        assertEquals(9, result)
    }
}
