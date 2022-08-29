package com.generation.chapter2;

import java.util.Optional;

public class OptionalsApp {
	 public static void main(String[] args) {

	        Optional<String> emptyOpt = Optional.empty();
	        Optional<String> nameOpt = Optional.of("Kathryn");
	        
	        //optional has a value?
	        if(nameOpt.isPresent()) {
	        	//data exist
	        	System.out.println("Hi"+ nameOpt.get());
	        }else {
	        	System.out.println("Hi");
	        }
	        
	        if(emptyOpt.isPresent()) {
	        	//data exist
	        	System.out.println("Hi"+ nameOpt.get());
	        }else {
	        	System.out.println("Hi");
	        }
	        
	        System.out.println("Hi"+nameOpt.orElse("default value"));
	        System.out.println("Hi"+emptyOpt.orElse("default value"));
	        
	    }
}
