package com.fizz.buzz;

public enum PrintOption {
    FIZZ("Fizz"), BUZZ("Buzz"), FIZZBUZZ("FizzBuzz");
    private String value;

    PrintOption(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
