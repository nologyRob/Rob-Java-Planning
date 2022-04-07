package com.company.DayTwo.string;

public class StringMethods {

    // In Java, string is basically an object that represents sequence of char values.

    // An array of characters works same as Java string. For example:

    char[] ch = {'r', 'o', 'b', ' ', 'h', 'o', 'o', 'p', 'e', 'r'};
    String stringObject = new String(ch);

    // The more common way to create a new string, like we do in Javascript.
    // Note - Primitive data types are all lower case but String is not? Why?

    String newString = "hello";

    // Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters. The java.lang.String class is used to create a string object.



    // Java String class provides a lot of methods to perform operations on strings such as:
    // charAt(), length(), concat(), equals(), split(), replace(), compareTo(), substring()

    // charAt()

    String name="robhooper";
    char newChar = name.charAt(4);//returns the char value at the 4th index


    // length()

    int stringLength = name.length();//returns the length of the string

    //equals()

    String one = "one";
    String two = "two";
    String three = "one";

    boolean isStringTheSame = one.equals(two); // This would return false
    boolean isStringTheSameAgain = one.equals(three); // This would return true

    // split() - The method split() splits a String into multiple Strings given the delimiter that separates them.
    // The returned object is an array which contains the split Strings.

    String[] newSplitString = name.split("");// This would return an array of all the letters at their own index because we are splitting by ""

}



