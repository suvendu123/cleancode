package com.cleancode.wordcount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> count(String sentence) {
		return count(sentence, Delimiter.DEFAULT);
	}

	public Map<String, Integer> count(String sentence, Delimiter delimeter) {
		String[] words = sentence.split(delimeter.value());
		return getWordsMap(words);
	}

	private Map<String, Integer> getWordsMap(String[] words) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String word : words) {
			verifyWordOccurrence(wordMap, word);
		}
		return wordMap;
	}

	private void verifyWordOccurrence(Map<String, Integer> wordMap, String word) {
		if (wordMap.containsKey(word)) {
			wordMap.put(word, wordMap.get(word) + 1);
		} else {
			wordMap.put(word, 1);
		}

	}

}
