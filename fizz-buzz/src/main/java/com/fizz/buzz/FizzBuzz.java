package com.fizz.buzz;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";
    public final static String BUZZ = "Buzz";
    public final static String FIZZBUZZ = "FizzBuzz";

    public Object process(Integer input) {
        if (isDivisible(3, input) && isDivisible(5, input)) {
            return FIZZBUZZ;
        }
        if (isDivisible(5, input)) {
            return BUZZ;
        }
        if (isDivisible(3, input)) {
            return FIZZ;
        }
        return input;
    }

    private boolean isDivisible(Integer divisible, Integer input) {
        return input % divisible == 0;

    }

}
