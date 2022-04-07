package com.company;

import com.company.DayTwo.letmecalculate.Calculator;
import com.company.DayTwo.string.StringMethods;

public class Main {

    static String name = "robhooper";
    static String other = "Rob Hooper";
    static String[] newSplitString = name.split("");
    static String[] otherSplitString = other.split(" ");

    public static void main(String[] args) {

        for (String s : otherSplitString) {
            System.out.println(s);
        }




    }
}
