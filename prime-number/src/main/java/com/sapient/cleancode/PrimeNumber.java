package com.sapient.cleancode;

public class PrimeNumber {

    public Boolean verify(Integer number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
