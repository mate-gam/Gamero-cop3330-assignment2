/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex29;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App
{
    boolean validateRate(String rate)
    {
        //checks to see if valid int
        try
        {
            Integer.parseInt(rate);
            return false;
        } catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return true;
        }
    }

    int returnYears (int rate)
    {
        //calculation
        int years = 72 / rate;
        return years;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        String rate;
        do {
            //makes sure user inputs a number
            System.out.println("What is the rate of return? ");
            rate = sc.next();
        } while (app.validateRate(rate));
        //goes ahead to make it an integer after confirm
        int rateInt = Integer.parseInt(rate);
        System.out.println("It will take " + rateInt + " years to double your initial investment.");
    }
}
