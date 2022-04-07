package com.company.DayTwo.paperScissorsRock;

import java.util.Locale;
import java.util.Scanner;

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

        int randomNumber = (int) Math.floor(Math.random() * 4);
        switch (randomNumber) {
            case 0:
                System.out.println("Computer chose Paper");
                computerChoice = "Paper";
                break;
            case 1:
                System.out.println("Computer chose Scissors");
                computerChoice = "Scissors";
                break;
            case 2:
                System.out.println("Computer chose Rock");
                computerChoice = "Rock";
                break;

        }
        if (playerChoice.equals("Rock") && (computerChoice.equals("Scissors"))) {
            System.out.println("Player Wins");
        } else if (playerChoice.equals("Rock") && (computerChoice.equals("Paper"))) {
            System.out.println("Player Loses");
        } else if (playerChoice.equals("Rock") && (computerChoice.equals("Rock"))) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("Paper") && (computerChoice.equals("Scissors"))) {
            System.out.println("Player Loses");
        } else if (playerChoice.equals("Paper") && (computerChoice.equals("Rock"))) {
            System.out.println("Player Wins");
        } else if (playerChoice.equals("Paper") && (computerChoice.equals("Paper"))) {
            System.out.println("It's a tie");
        } else if (playerChoice.equals("Scissors") && (computerChoice.equals("Rock"))) {
            System.out.println("Player Loses");
        } else if (playerChoice.equals("Scissors") && (computerChoice.equals("Paper"))) {
            System.out.println("Player Wins");
        } else if (playerChoice.equals("Scissors") && (computerChoice.equals("Scissors"))) {
            System.out.println("It's a tie!");
        }


    }

}
