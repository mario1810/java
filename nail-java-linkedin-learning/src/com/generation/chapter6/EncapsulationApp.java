package com.generation.chapter6;


public class EncapsulationApp {

    public static void main(String[] args) {
        HogwartsStudent student = new HogwartsStudent(
                "Elizabeth Blackburn", 11);

        System.out.println("Name: " + student.getName());
        System.out.println("House: " + student.getHouse());

        // CANNOT DO:
        //student.name;
        //student.age;
    }
}
