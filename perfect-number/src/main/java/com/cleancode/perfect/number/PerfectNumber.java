package com.cleancode.perfect.number;

import java.util.stream.IntStream;

public class PerfectNumber {

	public boolean isPerfect(int inputNumber) {
		return getSumOfFactors(inputNumber) == inputNumber;
	}

	private int getSumOfFactors(int inputNumber) {
		return IntStream.rangeClosed(1, inputNumber / 2).filter(i -> inputNumber % i == 0).sum();

	}

}
