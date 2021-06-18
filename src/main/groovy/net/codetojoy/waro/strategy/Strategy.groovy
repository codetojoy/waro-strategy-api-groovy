package net.codetojoy.waro.strategy;

import java.util.stream.IntStream;

public interface Strategy {
    int selectCard(int prizeCard, List<Integer> hand, int maxCard);
}
