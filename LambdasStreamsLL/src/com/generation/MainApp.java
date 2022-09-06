package com.generation;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class MainApp {

	//Using the interface with the OOP model
	public static void main(String[] args) {
		Greeting greeting = new HelloGreeting();
		greeting.sayHello();
		
		
		//instead of creating a class to implement the interface
		Greeting greeting2= new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello world 2");
				
			}
		};
		
		greeting2.sayHello();
		
		//Lambda
		Greeting greeting3 = ()->System.out.println("Hello world 3");
		greeting3.sayHello();
		
		//Lambda multiple lines and parameters
		Calculator calculator = (int x, int y)->{
			Random random = new Random();
			int randomNumber= random.nextInt(50); //int between 0-49
			return x*y+randomNumber;
		};
		System.out.println(calculator.calculate(1, 2));
		
		//Using a java built-in interface
		IntBinaryOperator calculator2=(int x, int y)->{
			Random random = new Random();
			int randomNumber= random.nextInt(50); //int between 0-49
			return x*y+randomNumber;
		};
		//The named of the method is defined ont he interface IntBinaryOperator
		System.out.println(calculator2.applyAsInt(1, 2));
		
		
		
	}//end main
}
