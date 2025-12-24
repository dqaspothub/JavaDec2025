package com.java.learning.StringConcepts;

public class StringCreation {

    public static void main(String[] args) {

        String str1 = "Hello"; // String literal
        String str2 = new String("Hello"); // Using the constructor
        String str3 = "Hello";

        //Address verification

        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("str1 == str3: " + (str1 == str3)); // true (string literal pool)

        // Content verification

        System.out.println("str1 equals str2: " + (str1.equals(str2))); //true
        System.out.println("str1 equals str3: " + (str1.equals(str3))); //true


        String upperCaseValue = str1.toUpperCase();

        System.out.println(upperCaseValue);

       String LowerCaseValue =  str1.toLowerCase();

        System.out.println(LowerCaseValue);

        }
}

/*
Explanation:
Demonstrates string literal creation and the constructor.
Shows how string literals are often reused from the string literal pool.
Highlights immutability: concatenation creates a new string object, leaving the original unchanged*/
