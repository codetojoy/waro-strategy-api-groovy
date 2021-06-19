package net.codetojoy.waro.strategy

import org.junit.jupiter.api.Test
import static org.junit.Assert.*

public class MaxCardTest {
    @Test
    public void testSelectCard() {
        Strategy strategy = new MaxCard()
        int maxCard = 50
        int prizeCard = 10
        int handSize = 20
        def hand = (1..handSize).collect{ it }

        // test
        int result = strategy.selectCard(prizeCard, hand, maxCard)

        assertEquals(handSize, result)
    }
}
