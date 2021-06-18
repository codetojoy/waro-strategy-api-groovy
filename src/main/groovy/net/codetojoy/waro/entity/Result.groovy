package net.codetojoy.waro.entity

import com.fasterxml.jackson.annotation.JsonProperty

public class Result {
    @JsonProperty("card")
    int card

    @JsonProperty("message")
    String message
}
