package com.cleancode.wordcount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	
	private WordCount wordCount;
	
	@Before
	public void setUp(){
		wordCount = new WordCount();
	}

	@Test
	public void should_return_two_qnique_word() {
		Map<String, Integer> wordMap = wordCount.count("Hello World");
		
		assertEquals(2, wordMap.size());
		assertTrue(wordMap.containsKey("Hello"));
	}

	@Test
	public void should_return_qnique_word_and_count_of_occurrence() {
		Map<String, Integer> wordMap = wordCount.count("Hello World Hello");
		
		assertMap(wordMap);
	}
	
	@Test
	public void should_return_qnique_word_with_any_delimiters() {
		Map<String, Integer> wordMap = wordCount.count("Hello,World,Hello", Delimiter.COMMA);

		assertMap(wordMap);
	}
	
	@Test
	public void should_return_qnique_word_for_a_long_sentence() {
		Map<String, Integer> wordMap = wordCount.count("Clean; code; always; looks; like; it; was; written; by; someone; who; cares;", Delimiter.TERMINATE);

		assertEquals(12, wordMap.size());
		assertTrue(wordMap.containsKey("Clean"));

	}

	private void assertMap(Map<String, Integer> wordMap) {
		assertEquals(2, wordMap.size());
		assertEquals(2, wordMap.get("Hello").intValue());
	}
}
