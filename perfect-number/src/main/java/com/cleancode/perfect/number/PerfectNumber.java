package com.cleancode.perfect.number;

public class PerfectNumber {

	public boolean isPerfect(int inputNumber) {
		return getSumOfFactors(inputNumber) == inputNumber;

	}

	private int getSumOfFactors(int inputNumber) {
		int sum = 0;
		for (int i = 1; i <= inputNumber / 2; i++) {
			if (inputNumber % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
