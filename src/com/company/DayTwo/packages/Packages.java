package com.company.DayTwo.packages;

import com.company.DayTwo.letmecalculate.Calculator;

import java.util.Scanner;

public class Packages {

        // Packages
        // Two different types of packages in Java - Built-in and User Defined


        // Example of built-in packages available in Java
        Scanner robsScanner = new Scanner(System.in);
        // You will notice that when we created this new scanner that something popped up at the top of the page.
        // In this situation we just imported a package to our project!
        //  java = top level package
        //  util = sub package
        //  Scanner = A class within the util sub package.
        //  Do we know any other packages that have popped up so far?
        //  Show list of useful packages (https://www.javaguides.net/2019/07/list-of-useful-core-java-packages.html)


        // Note! Not all packages will show up as being imported.  Java.lang is auto-imported.
        // Why were these packages created? What might the reason be?
        // Reusability, Better Organisation and Name Conflicts (Because they are in different packages they can have the same name)


        // Example of user-defined packages available in Java
        // Create a new package called "LetMeCalculate" in the .com.company folder, create a new class called Calculator.  This will
        // be a user defined package that lets us calculate two numbers.  Don't worry too much about the code for now!
        //  public int add(int a, int b){
        //	return a+b;
        //   }


        //        ****Insert into main method***
        //        Calculator calc = new Calculator();
        //
        //        calc.add(3,4);




}
