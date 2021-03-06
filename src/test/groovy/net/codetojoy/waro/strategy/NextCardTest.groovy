package net.codetojoy.waro.strategy

import org.junit.jupiter.api.Test
import static org.junit.Assert.*

public class NextCardTest {
    @Test
    public void testSelectCard() {
        Strategy strategy = new NextCard()
        int maxCard = 50
        int prizeCard = 10
        int handSize = 20
        def hand = (2..handSize).collect{ it }

        // test
        int result = strategy.selectCard(prizeCard, hand, maxCard)

        assertEquals(2, result)
    }

}
