package net.codetojoy.waro.strategy

class Strategies {
    static final def MAX = "max";
    static final def MIN = "min";
    static final def NEAREST = "nearest";
    static final def NEXT = "next";

    Strategy getStrategy(String mode) {
        Strategy result = null

        switch (mode.toLowerCase()) {
            case MAX:
                result = new MaxCard()
                break
            case MIN:
                result = new MinCard()
                break
            case NEAREST:
                result = new NearestCard()
                break
            case NEXT:
                result = new NextCard()
                break
            default:
                throw new IllegalArgumentException("unknown strategy: " + mode)
                break
        }

        return result
    }
}
