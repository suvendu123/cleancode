package com.fizz.buzz;

import static org.junit.Assert.assertEquals;
import static com.fizz.buzz.PrintOption.BUZZ;
import static com.fizz.buzz.PrintOption.FIZZBUZZ;
import static com.fizz.buzz.PrintOption.FIZZ;
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
        assertEquals(FIZZ.value(), fizzBuzz.verifyFizzBuzz(6));
    }

    @Test
    public void shouldPrintBuzz() {
        assertEquals(BUZZ.value(), fizzBuzz.verifyFizzBuzz(10));
    }

    @Test
    public void shouldPrintFizzBuzz() {
        assertEquals(FIZZBUZZ.value(), fizzBuzz.verifyFizzBuzz(15));
    }
    
}
