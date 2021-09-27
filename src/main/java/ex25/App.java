/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex25;
import java.util.Scanner;


public class App
{
    String passwordValidator(String password)
    {
        int digits = 0, character = 0, special = 0;
        //gets the info about the password
        for(int i = 0; i<password.length();i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                digits++;
            }
            else if(Character.isLetter(password.charAt(i)))
            {
                character++;
            }
            else
            {
                special++;
            }
        }
        //returns the correct String
        if (password.length() == digits)
        {
            return String.format("The password '%s' is a very weak password.",password);
        }
        if (password.length() == character)
        {
            return String.format("The password '%s' is a weak password.",password);
        }
        if (special > 0 && password.length() >= 8)
        {
            return String.format("The password '%s' is a very strong password.", password);
        }
        else
        {
            return String.format("The password '%s' is a strong password.", password);
        }
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");//Console doesnt work with testing
        //Console con = System.console();
        //String password = con.readLine("Please enter a password: ");
        String password = sc.next();
        App app = new App();
        String passwordStrength = app.passwordValidator(password);
        System.out.println(passwordStrength);
    }
}
