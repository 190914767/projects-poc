package com.java.iq.core.companies.zynga;

import java.util.*;
import java.io.*;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "input-files/strText.txt";
		Scanner input = new Scanner(new File(fileName));

		// count occurrences
		int maxChar = 0;
		String maxStrng = "";
		Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		while (input.hasNext()) {
			String next = input.next().toLowerCase();
			if (!wordCounts.containsKey(next)) {
				wordCounts.put(next, 1);
			} else {
				wordCounts.put(next, wordCounts.get(next) + 1);
			}
			maxChar = Math.max(wordCounts.get(next), maxChar);
			if (maxChar == next.length()) {
				maxStrng = next;
			}
		}

		System.out.println("maximum occurred word is: " + maxStrng);
	}
}