package net.codetojoy.waro.service

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import net.codetojoy.waro.exceptions.StrategyException
import net.codetojoy.waro.entity.Result
import net.codetojoy.waro.strategy.*

@RestController
@RequestMapping("/waro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
class StrategyService {

    @GetMapping("/strategy")
    ResponseEntity<Result> selectCard(
            @RequestParam(name="prize_card") int prizeCard,
            @RequestParam(name="max_card") int maxCard,
            @RequestParam List<Integer> cards,
            @RequestParam String mode,
            @RequestParam(name="delay_in_seconds", required=false) Integer delayInSeconds
        ) throws StrategyException {

        doDelay(delayInSeconds)

        def now = new Date().toString()
        def prefix = "TRACER $now :"
        println(prefix + " prizeCard: $prizeCard"
                       + " maxCard: $maxCard"
                       + " mode: $mode"
                       + " cards: $cards")

        def strategy = new Strategies().getStrategy(mode)
        def pick = strategy.selectCard(prizeCard, cards, maxCard)
        def message = now + " OK"

        def result = new Result(card: pick, message: message)

        return new ResponseEntity<Result>(result, HttpStatus.OK)
    }

    void doDelay(Integer delayInSeconds) {
        if (delayInSeconds) {
            try {
                println("TRACER pathological delay: $delayInSeconds  sec")
                Thread.sleep(delayInSeconds * 1000)
            } catch (Exception ex) {
            }
        }
    }
}
