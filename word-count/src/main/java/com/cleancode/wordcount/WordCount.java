package com.cleancode.wordcount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> count(String sentence) {
		String[] words = sentence.split(" ");
		return getWordsMap(words);
	}

	private Map<String, Integer> getWordsMap(String[] words) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String word : words) {
			wordMap.put(word, 1);
		}
		return wordMap;
	}

}
