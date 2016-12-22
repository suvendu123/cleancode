package com.fizz.buzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void shouldPrintFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.process(6));
    }
    
    @Test
    public void shouldPrintBuzz(){
        
    }
    
    @Test
    public void shouldPrintFizzBuzz(){
        
    }

}
