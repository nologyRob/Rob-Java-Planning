# Java 02

## Coach Notes

- Main Method, Packages, Casting, Math Methods, String Methods
- Students provided template for lesson via repository.  All files/folders ready to use
- Students still haven't learnt about methods so a method is provided in each class for students to complete work
- All methods are called back in Main Method.

## Slides

- NEED TO MAKE

## Main Method

- Discuss how Java application has at least one class and at least one main method.
- Normally, an application consists of many classes and only one of the class needs to have a main method.
- All code is run through the main method - This is like the execution ground!
- main method can be created by simply typing 'main' and pressing tab.

### Packages

- Two different types of packages in Java - Built-in and User Defined
- Example of built-in packages available in Java

        Scanner robsScanner = new Scanner(System.in);

- Discuss how that imported a package at the top of our class
- Discuss any other packages that have popped up so far?
- Show list of useful packages (https://www.javaguides.net/2019/07/list-of-useful-core-java-packages.html)
- Discuss purpose of packages (Reusability, Better Organisation)

#### Packages Example
- Create a new package called "LetMeCalculate" in the .com.company folder, create a new class called Calculator.  This will
  be a user defined package that lets us calculate two numbers.

  
     public int add(int a, int b){
     return a+b;
      }

***Insert into main method***

    Calculator calc = new Calculator();

    calc.add(3,4);
    

### Casting

- Typecasting lets you take a number of one type and turn it into another type


    int castPlease = 1.5;

- Discuss why that wouldn't work?


    public int castThisOne = (int) 1.5;
    

- Discuss syntax
- Discuss what happens when narrowing (chops off/rounds down)
- Java will automatically cast up BUT it will not automatically cast down.
- Show examples of this (see package notes for details)

#### Not casting but similar - String.valueOf() & Integer.parseInt()

converts int to string type

    int numAsStringConverted = Integer.parseInt(data);

convert string variable to int

    int numAsStringConverted = Integer.parseInt(data);

### Math Methods

- Java Math class provides several methods to work on math calculations
- Generate random number between 0 to 20 (See Package Notes for code)
- Show and discuss list of Math Methods - https://www.javatpoint.com/java-math - For all the Math methods
- Code examples for students (See package notes for code)


### String Methods
- In Java, string is basically an object that represents sequence of char values.
- Note - Primitive data types are all lower case but String is not? Why?
  - Java String class provides a lot of methods to perform operations on strings such as;
  

      charAt(), length(), concat(), equals(), split(), replace(), compareTo(), substring()

- Code examples of above methods (See packages notes for code)


---



## Code-along

### Paper Scissors Rock
***All code must be completed in the PSR class using the lesson method.***

    public class PSR {
      static String playerChoice;
      static String computerChoice;
  
  
      public static void main(String[] args) {
  
          Scanner game = new Scanner(System.in);
          System.out.println(" Welcome to Paper, Scissors, Rock\n The aim of the game is to beat the computer!!\n Please enter a choice: P, S or R");
  
          switch (game.nextLine().toLowerCase(Locale.ROOT)) {
              case "p":
                  System.out.println("You chose Paper");
                  playerChoice = "Paper";
                  break;
              case "s":
                  System.out.println("You chose Scissors");
                  playerChoice = "Scissors";
                  break;
              case "r":
                  System.out.println("You chose Rock");
                  playerChoice = "Rock";
                  break;
              default:
                  System.out.println("You chose an incorrect playing option!");
                  break;
          }
  
          int randomNumber = (int) Math.floor(Math.random() * 3);
  
          switch (randomNumber) {
              case 0:
                  System.out.println("Computer chose Paper");
                  computerChoice = "Paper";
                  break;
              case 1:
                  System.out.println("Computer chose Scissors");
                  computerChoice = "Scissors";
                  break;
              // ALWAYS GOOD TO HAVE DEFAULT
              default:
                  System.out.println("Computer chose Rock");
                  computerChoice = "Rock";
                  break;
          }
  
          // CHECK FOR TIE FIRST
          if (playerChoice.equals(computerChoice)) {
              // ADD CHOICE ON THE END OF OUTPUT
              System.out.println("It's a tie! You both chose " + playerChoice);
              // CHECK WINNING PLAYER MOVES
          } else if (playerChoice.equals("Rock") && (computerChoice.equals("Scissors"))) {
              // USE CHOICE IN OUTPUT -> MORE GENERIC OUTPUT LESS WRITING IN LESSON :)
              System.out.println("You Win - " + playerChoice + " Beats " + computerChoice);
          } else if (playerChoice.equals("Paper") && (computerChoice.equals("Rock"))) {
              System.out.println("You Win - " + playerChoice + " Beats " + computerChoice);
          } else if (playerChoice.equals("Scissors") && (computerChoice.equals("Paper"))) {
              System.out.println("You Win - " + playerChoice + " Beats " + computerChoice);
          } else {
              // IF PLAYER HASN'T WON MUST MEAN COMP HAS WON
              System.out.println("You Lose - " + computerChoice + " Beats " + playerChoice);
          }
  
      }
    }


---

### Challenge - Primitive Type Dictionary

So far in Java you have learnt about the following:
- Primitive Data Types
- Control Flow - if, else if, while, switch
- Math methods
- String methods
- System.in (User input)
- System.out (Console logging)


    Your challenge is to use this new knowledge to create 'Dice Black Jack'

    Dice Black Jack Rules

    Two Players - Person vs Computer
            Simple - Each player rolls the dice 5 times and the player with the highest score under or equal to 21 wins.
            Simple - If the score of each player goes over 21, they are bust!

            Advanced -   Each player can roll up to 5 times. They are presented their total score each time and have the decision to "hit" or "stay".
            Advanced -   The winner of the game is the player with the highest sore under or equal to 21

            Extra Advanced - Can you make the game repeat? You might need to research "Do-While" in order to achieve this.

    We would like to see you use all Java learning to this point in today's challenge

    All code must be completed in the Challenge class using the lesson method.

---
