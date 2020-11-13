package com.fatihyildiz.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean retrieveCurrencyConversionBean(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){

        return new CurrencyConversionBean(1L, from, to ,BigDecimal.ONE , quantity, quantity, 0);
    }
}