package com.fizz.buzz;

import static org.junit.Assert.assertEquals;
import static com.fizz.buzz.FizzBuzz.FIZZ;
import static com.fizz.buzz.FizzBuzz.BUZZ;
import static com.fizz.buzz.FizzBuzz.FIZZBUZZ;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintFizz() {
        assertEquals(FIZZ, fizzBuzz.process(6));
    }

    @Test
    public void shouldPrintBuzz() {
        assertEquals(BUZZ, fizzBuzz.process(10));
    }

    @Test
    public void shouldPrintFizzBuzz() {
        assertEquals(FIZZBUZZ, fizzBuzz.process(15));
    }

}
