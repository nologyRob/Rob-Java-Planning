package com.company.DayTwo.math;

public class MathMethods {

    // Java Math class provides several methods to work on math calculations

    // Math.random()	It returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

    // Generate random number between 0 to 20
     double a = Math.random() * 20;
     double aWhole = Math.floor(a);
     double b = Math.random() * 20;
     double bWhole = Math.floor(b);

    //OR you can one line it like this - This will generate a random number AND round down at the same time.

    double c = Math.floor(Math.random()*20);

    // Math.min()	It is used to return the Smallest of two values.
    int x = 20;
    int y = 50;
    int z = Math.min(x,y);


    // Math.max() - It returns the Largest of two values
    int d = 20;
    int e = 50;
    int f = Math.max(x,y);


    // Math.pow()	It returns the value of first argument raised to the power to second argument.
    double firstNumber = 5;
    double secondNumber = 4;
    double product = Math.pow(firstNumber,secondNumber);
    //returns 5 power of 4 i.e. 5*5*5*5

    // Math.ceil()	It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
    // Math.floor()	It is used to find the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.

    // https://www.javatpoint.com/java-math - For all the Math methods


    //        ****Insert into main method***

    //        System.out.println(a);
    //        System.out.println(aWhole);
    //        System.out.println(b);
    //        System.out.println(bWhole);






}
