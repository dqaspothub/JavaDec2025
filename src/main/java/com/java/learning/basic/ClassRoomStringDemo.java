package com.java.learning.basic;

public class ClassRoomStringDemo {

    public static void main(String[] args) {

        String str1 = "Sandhya";
        String str2 = new String("Kannathasan");
        String str3 = "Sandhya";
        String str4 = new String("KANNathasan");

        String str5 = new String("KannAthasan");


        System.out.println(str1==str2); //Address verification

        System.out.println(str1==str3);

        System.out.println(str2==str4);

        System.out.println(str1.equals(str2)); //Address verification

        System.out.println(str1.equals(str3));

        System.out.println(str2.equals(str4));

      int totalLength =   str1.length();

      System.out.println("The length of the string " +totalLength );

      String convertedToUpperCase =  str2.toUpperCase();

      System.out.println("The UpperCase " + convertedToUpperCase);

       // System.out.println(str2.toUpperCase());

        String covertedToLowerCase = str2.toLowerCase();
        System.out.println("The lower Case " + covertedToLowerCase );

        char c = str1.charAt(2);

        System.out.println(c);

        System.out.println(str2.equals(str5));

        System.out.println(str2.equalsIgnoreCase(str4));

        System.out.println(str1.startsWith("Sa"));

        System.out.println(str1.endsWith("a"));

        System.out.println(str1.contains("dh"));


    }
}
