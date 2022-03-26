package com.example.resthomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService service = new CalculatorService();

    @GetMapping("/calculate")
    public IResult calculate(@RequestParam(value = "a") float a, @RequestParam(value = "b") float b,
                                     @RequestParam(value = "operator") String operator) {
        try {
            return new CalculateResult(service.calculate(a, b, operator));
        } catch (IllegalArgumentException e) {
            return new InvalidMessage(e.getMessage());
        }
    }
}
