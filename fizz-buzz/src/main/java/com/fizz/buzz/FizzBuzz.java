package com.fizz.buzz;
import static com.fizz.buzz.PrintOption.BUZZ;
import static com.fizz.buzz.PrintOption.FIZZBUZZ;
import static com.fizz.buzz.PrintOption.FIZZ;

public class FizzBuzz {


    public String verifyFizzBuzz(Integer input) {
        if (isDivisible(3, input) && isDivisible(5, input)) {
            return FIZZBUZZ.value();
        }
        if (isDivisible(5, input)) {
            return BUZZ.value();
        }
        if (isDivisible(3, input)) {
            return FIZZ.value();
        }
        return input.toString();
    }

    private boolean isDivisible(Integer divisible, Integer input) {
        return input % divisible == 0;

    }

}
