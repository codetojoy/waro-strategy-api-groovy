package net.codetojoy.waro.entity

import com.fasterxml.jackson.annotation.JsonProperty

class Result {
    @JsonProperty("card")
    int card

    @JsonProperty("message")
    String message
}
