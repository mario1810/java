package com.generation;

public class MainApp {

	public static void main(String[] args) {
		Greeting greeting = new HelloGreeting();
		greeting.sayHello();
		
		Greeting greeting2= new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello world 2");
				
			}
		};
		
		greeting2.sayHello(); 
	}

}
