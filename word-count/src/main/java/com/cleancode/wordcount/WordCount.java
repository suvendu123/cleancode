package com.cleancode.wordcount;

import static java.util.stream.Collectors.toMap;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> count(String sentence) {
		return count(sentence, Delimiter.DEFAULT);
	}

	public Map<String, Integer> count(String sentence, Delimiter delimeter) {
		List<String> words = asList(sentence.split(delimeter.value()));
		return getWordsMap(words);
	}

	private Map<String, Integer> getWordsMap(List<String> words) {
		return words.stream().collect(toMap(key -> key, value -> 1, Integer::sum));

	}

}
