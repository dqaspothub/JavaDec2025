package com.java.learning.controlFlow;

public class EnhancedForExample {
/*
    for (DataType variable : arrayOrCollection) {
        // Code to be executed for each element
    }
    */
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        String[] students = {"kanna","Anu","Diyu", "Hari"};

        for(String student : students)
        {
            System.out.println("My Name " +student);
        }

        for (int num : numbers) {

            System.out.println("Number: " + num);
        }


    }
}
