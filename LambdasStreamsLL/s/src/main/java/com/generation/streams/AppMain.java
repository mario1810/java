package com.generation.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {

	public static void main(String[] args) {
		
		//array
		Integer[] scores= new Integer[]{80,66,73,92,43};
		Stream<Integer>scoresStream =Arrays.stream(scores);
	
		
		//List
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
		
		Stream<String>shoppingListStream=shoppingList.stream();
		
		Stream<String> lettersStream= Stream.of("a","b","c");
		
		shoppingListStream.sorted()
							.map(item->item.toUpperCase())
							.filter(item->item.startsWith("P"))
							.forEach(item->System.out.println(item));

	}

}
