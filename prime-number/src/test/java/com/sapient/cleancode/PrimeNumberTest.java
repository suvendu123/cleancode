package com.sapient.cleancode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumberTest {
    
    private PrimeNumber prime = new PrimeNumber();
    @Test
    public void testPrimeNumber(){
        assertTrue(prime.verify(17));
        assertTrue(prime.verify(19));
    }
    
    @Test
    public void testNotPrimeNumber(){
        assertFalse(prime.verify(16));
        assertFalse(prime.verify(20));
    }

}
