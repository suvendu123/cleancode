package com.cleancode.perfect.number;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {

    private PerfectNumber number;

    @Before
    public void setUp() {
        number = new PerfectNumber();
    }

    @Test
    public void should_return_true_if_perfect_number() {
        assertTrue(number.isPerfect(6));
    }

    @Test
    public void should_return_false_if_not_a_perfect_number() {
        assertFalse(number.isPerfect(7));
    }

}
