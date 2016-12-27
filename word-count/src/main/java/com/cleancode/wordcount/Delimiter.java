package com.cleancode.wordcount;

public enum Delimiter {
	COMMA(","), DEFAULT(" "), TERMINATE(";");

	private String value;

	Delimiter(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

}
