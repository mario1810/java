package com.generation.chapter5;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedWordApp {
	
    public static String findMostRepeatedWord(String input) {

        List<String> uncommonWords =  convertToUncommonWords(input);

        if (uncommonWords.size() == 0) {
            System.out.println("No unique words in input");
            return "";
        }

        HashMap<String, Integer> wordCountMap = new HashMap();
        for (String word : uncommonWords) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        int max = 0;
        String mostRepeatedWord = "";
        for (String key : wordCountMap.keySet()) {
            int currentValue = wordCountMap.get(key);
            if (currentValue > max) {
                mostRepeatedWord = key;
                max = currentValue;
            }
        }

        System.out.println("Most repeated word: " + mostRepeatedWord +
                "\nRepeated: " + max + " times");
        return mostRepeatedWord;
    }

    public static List<String> convertToUncommonWords(String input) {

        String lowercased = input.toLowerCase().trim();
        String[] words = lowercased.split("[ \\n\\t\\r.,;:!?(){]");

        List commonWords = List.of("the", "a", "or", "an", "it", "and",
                "but", "is", "are", "of", "on", "to", "was", "were", "in",
                "that", "i", "your", "his", "their", "her", "you", "me",
                "they", "at", "be");

        return Arrays.stream(words)
                .filter(word ->
                        !commonWords.contains(word) && word.length() != 0)
                .collect(Collectors.toList());
    }
	
	
	 public static void main(String[] args) {

	        String testString = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	        findMostRepeatedWordM(testString);
	        findMostRepeatedWord(testString);

	        System.out.println();
	        String testString2 = "Penguins are aquatic, flightless birds that are highly adapted to life in the water. Their distinct tuxedo-like appearance is called countershading, a form of camouflage that helps keep them safe in the water. Penguins do have wing-bones, though they are flipper-like and extremely suited to swimming. Penguins are found almost exclusively in the southern hemisphere, where they catch their food underwater and raise their young on land.";
	        findMostRepeatedWordM(testString2);
	        findMostRepeatedWord(testString2);

	        System.out.println();
	        String testString3 = "Students seek relief from rising prices through the purchase of used copies of textbooks, which tend to be less expensive. Most college bookstores offer used copies of textbooks at lower prices. Most bookstores will also buy used copies back from students at the end of a term if the book is going to be re-used at the school. Books that are not being re-used at the school are often purchased by an off-campus wholesaler for 0-30% of the new cost, for distribution to other bookstores where the books will be sold. Textbook companies have countered this by encouraging faculty to assign homework that must be done on the publisher's website. If a student has a new textbook, then he or she can use the pass code in the book to register on the site. If the student has purchased a used textbook, then he or she must pay money directly to the publisher in order to access the website and complete assigned homework. ";
	        findMostRepeatedWordM(testString3);
	        findMostRepeatedWord(testString3);
	    }

	private static void  findMostRepeatedWordM(String text) {
		String s1=text.trim();
		if(s1.length()==0)
				System.out.println("There isn't a word");
		//.replaceAll("[\\n\\t\\r\\.,;:!?(){]+"," ")
		s1=s1.toLowerCase().replaceAll("\\b(the|a|or|an|it|and|but|is|are|of|on|to|was|were|in|that|i|your|his|their|her|you|me|they|at|be)\\b","").replaceAll("[\\n\\t\\r\\.,;:!?(){]+"," ");
		String[] arrayWords=s1.split("[ ]+");
		Map<String,Integer> myMap= new HashMap<>();
		for(int i=0; i<arrayWords.length;i++) {
			if(myMap.containsKey(arrayWords[i])) {
				myMap.put(arrayWords[i], (myMap.get(arrayWords[i])+1));
			}else {
				myMap.put(arrayWords[i], 1);
			}	
		}
		
		String word="";
		Integer max=0;
		for (Map.Entry<String,Integer> entry: myMap.entrySet())
        {
            if (entry.getValue()>max) {
                max=entry.getValue();
                word=entry.getKey();
            }
        }
		System.out.println(word);
	}
}

