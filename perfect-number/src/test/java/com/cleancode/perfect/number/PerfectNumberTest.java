package com.cleancode.perfect.number;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerfectNumberTest {
    
    @Test
    public void should_return_true_if_perfect_number(){
        PerfectNumber number = new PerfectNumber();
        assertTrue(number.isPerfect(6));
    }

}
