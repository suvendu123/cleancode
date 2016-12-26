package com.cleancode.wordcount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void should_return_two_qnique_word() {
		WordCount wordCount = new WordCount();

		Map<String, Integer> wordMap = wordCount.count("Hello World");

		assertEquals(2, wordMap.size());
		assertTrue(wordMap.containsKey("Hello"));
		
	}

}
