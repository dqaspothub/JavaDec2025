package com.java.learning.StringConcepts;

public class StringSplitting {
    public static void main(String[] args) {

        String str = "apple,banana,orange";

        String date = "31-12-2025";

        String[] parts = date.split("-");

        String[] fruits = str.split(",");

        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i=0;i< fruits.length-1;i++){

            System.out.println(fruits[i]);
        }

        System.out.println("Date Month Year:");
        for(String part :parts){
            System.out.println(part);
        }
        for(int i = 0;i< parts.length;i++){
            System.out.println(parts[i]);
        }

    }
}


/*
Explanation:
split(regex) splits the string into an array of substrings based on the given regular expression.*/
