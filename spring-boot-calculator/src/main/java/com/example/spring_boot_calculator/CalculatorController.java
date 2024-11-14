package com.example.spring_boot_calculator;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;

    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot Divide by zero ");

        }

        return a / b;
    }

}