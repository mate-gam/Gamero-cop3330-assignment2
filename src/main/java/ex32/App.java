/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex32;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class App
{
    boolean validateNumber (String num)
    {
        try
        {
            Integer.parseInt(num);
            return false;
        } catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What's your guess? ");
            return true;
        }
    }
    int findRandomNumber (int difficulty)
    {
        Random rand = new Random();
        if (difficulty == 1)
        {
            return rand.nextInt(10) + 1;
        }
        if (difficulty == 2)
        {
            return rand.nextInt(100) + 1;
        }
        if (difficulty == 3)
        {
            return rand.nextInt(1000) + 1;
        }
        return 0;
    }
    String tooLowOrTooHigh (int guess, int randomNumber)
    {
        if (guess == randomNumber)
        {
            return "Equals";
        }
        if (guess > randomNumber)
        {
            return "Too high";
        }
        return "Too low";
    }
    public static void main (String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        String again= "";
        do {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int randomNumber = app.findRandomNumber(sc.nextInt());
            System.out.print("I have my number. What's your guess? ");
            int i = 0;
            String stringGuess = "";
            do {
                stringGuess = sc.next();
                i++;
            } while (app.validateNumber(stringGuess));
            int guess = Integer.parseInt(stringGuess);
            while (!app.tooLowOrTooHigh(guess, randomNumber).equals("Equals"))
            {
                String guessingString = app.tooLowOrTooHigh(guess, randomNumber);
                System.out.print(guessingString + " Guess again: ");
                do {
                    stringGuess = sc.next();
                    i++;
                } while (app.validateNumber(stringGuess));
                guess = Integer.parseInt(stringGuess);
            }
            System.out.println("You got it in " + i + " guesses!");
            System.out.print("\nDo you wish to play again (Y/N)? ");
            again = sc.next();
        } while (again.equals("y") || again.equals("Y"));
    }
}
