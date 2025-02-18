package com.bptn.course._24_java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceStringExample {
	
	public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "world", "java", "stream", "example");

        // Use the map method to convert all words to uppercase
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase) // Using method reference for instance method
                .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseWords);

        // Use the reduce method to concatenate all the words
        String concatenatedWords = words.stream()
                .reduce("", (a, b) -> a  +  b); // Concatenating strings using lambda expression

        System.out.println("Concatenated words: " + concatenatedWords);
        
      // Calculate total length of all words
        int totalLength = words.stream()
                .reduce(0, (total, word) -> total + word.length(), Integer::sum);

        System.out.println("Total length of all words: " + totalLength);
        
        //Longest word
        String longest = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse("No longest word");
        System.out.println("Longest word: " + longest);
        
        //Comma separated words using reduce method
        String commaSeparated = words.stream()
                .reduce((word1, word2) -> word1 + ", " + word2)
                .orElse("List is empty");
        System.out.println("Comma-separated string: " + commaSeparated);
    }

}
