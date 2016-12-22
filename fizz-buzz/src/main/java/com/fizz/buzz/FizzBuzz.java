package com.fizz.buzz;

public class FizzBuzz {

    public final static String FIZZ = "Fizz";
    public final static String BUZZ = "Buzz";
    public final static String FIZZBUZZ = "FizzBuzz";

    public Object process(Integer i) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return FIZZBUZZ;
        }
        if (i % 5 == 0) {
            return BUZZ;
        }
        if (i % 3 == 0) {
            return FIZZ;
        }

        return i;
    }

}
