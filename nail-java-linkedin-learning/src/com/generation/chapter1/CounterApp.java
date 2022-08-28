package com.generation.chapter1;

public class CounterApp {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.incrementCount(5);
        System.out.println(c.count);
    }
}
