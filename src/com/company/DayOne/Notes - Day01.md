# Java 01

## Coach Notes

This can take awhile so get them to do it ahead of the lesson.

## Slides

- NEED TO MAKE

## Setup

- Install JDK
- Install IntelliJ

### Demo IntelliJ

- Settings
  - Themes
  - Format on save
  - Add imports on the fly
  - VSCode key mappings?

### VCS

- Use IntelliJ to clone the code-along repo ADD-REPO-URL-HERE
- file → new → project from version control
- Enter URL to clone the project

---

## Code-along

### System Out & Compiling

- Demo how you can use `System.out.println("Hello world");` as the equivalent to `console.log("Hello world")` in JavaScript.
- Briefly go through what is going on. You have a class which has a property which then has a method on it. The argument to the method will get printed.
- Emphasize the difference between compile time and runtime.
- Show how you can run your code in IntelliJ.

### Declaring variables & Primitive Types

Ask the students to take notes about each type as they will need it for the final challenge.

Talk through

- How you declare a variable
- The different primitive types
  - Name, Size and Use case


      DECLARING A VARIABLE
      
      // type variableName = value;
      
      // PRIMITIVE TYPES
      
      // WHOLE NUMBERS
      
      byte myByte = 127;
      // 8-bit number type -127 -> 127
      // need to save memory and are sure the value will between the range
      
      short myShort = 32767;
      // 16-bit number type -32,768 to 32,767
      // need to save memory and are sure the value will be above the byte range and below the int range
      
      int myInt = 2147483647;
      // 32-bit number type -2,147,483,648 to 2,147,483,647
      // standard arithmetic operations
      myInt = 5 / 2; // 2
      // no decimal value
      
      long myLong = 9223372036854775807L;
      // 64-bit number type -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
      // tell the compiler it is a long with L at the end
      
      char myChar = 'c';
      // '' single quotes
      // 16-bit byte ANSCII Character type
      // https://www.w3schools.com/charsets/ref_html_ascii.asp
      
      // FLOATING POINT TYPES / FRACTIONAL NUMBERS
      
      float myFloat = 1234567.12345678999999F;
      // 32 byte float type, 6-7 decimal digits
      // tell the compiler it is a float with a F at the end
      myFloat = 5; // 5.0
      
      double myDouble = 345.123456789012345;
      // 64 byte float type, 15 decimal digits
      
      // boolean
      // 1 byte type, true or false
      boolean myBoolean = true;
      boolean myOtherBoolean = false;

### Scanner

We want to use the scanner to make recapping control flow more interesting.

Briefly explain the scanner, for now it is just a way for us to get input into our Java application.

Show off the Intelli-sense that IntelliJ provides e.g. all of the different methods on the scanner.

Create a simple input a number output something.


    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your age:");
    
    int currentYear = 2022;
    
    int age = scanner.nextInt();
    
    int yearOfBirth = currentYear - age;
    
    System.out.println("You were born in " + yearOfBirth);
    
    scanner.close();

### Control Flow

This will be a recap of basic control flow that they will be comfortable with.

Use the scanner to get a value and based on the value output different options.

Show how you can check for equality in java `==`


      Scanner scanner = new Scanner(System.in);
      
      int age = scanner.nextInt();
      boolean parentalConsent = true;
      
      if (age >= 18 || (parentalConsent && age == 17)) {
          System.out.println("You are able to watch this 18 movie");
      } else if (age >= 16 || parentalConsent) {
          System.out.println("You are able to watch this 16 movie");
      } else {
          System.out.println("You are unable to watch either movie");
      }
      
      scanner.close();


### Mini Challenges


    //        Get 1 number from the user
    //        print "n is positive" if n is positive
    //        print "n is negative" if n is negative
    
    //        Get 3 numbers from the user
    //        Print "n is the largest", n being the largest of the 3 inputs


### Quote generator & While loop

Write a simple while loop that uses the scanner to stay in the loop or exit it.

If the user want to


    Scanner scanner = new Scanner(System.in);
    
    boolean runProgram = true;
    
    while (runProgram) {
        System.out.println("Select an option");
    
        System.out.println("1: Continue");
        System.out.println("2: Quit");
    
        int choice = scanner.nextInt();
    
        if (choice == 2) {
            runProgram = false;
            System.out.println("Goodbye");
        }
    }
    
    scanner.close();


### Challenge - Primitive Type Dictionary

Foundation

In Main create a command line app that responds to user input.

When the App is run it should print:

- A welcome message
- 9 options.
  - 1 - 8 will be each primitive type. e.g. “1 : byte”, “2 : int” etc...
  - 9 will be to exit the application.
- An enter input message

If the user selects a number 1 - 8 you need to print out the information below based on the type.

- The name of the type
- The size / width of type
- Use case for that type
- an example of how you would declare it
- After this it should loop back and print out the options again

If the user selects 9 print a goodbye message and end the application.

Intermediate

Can you research and write it with a switch case?

Advanced

Can you handle if the user puts in the incorrect input?

---
