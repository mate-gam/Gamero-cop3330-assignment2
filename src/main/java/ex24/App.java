/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex24;

import java.util.Scanner;

public class App
{
    String firstString;
    String secondString;

    public void setString(String firstString, String secondString)
    {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    boolean isAnagram(String one, String two)
    {
        int counter = 0;
        if (one.length() != two.length())
        {
            return false;
        }
        for (int i = 0; i < one.length(); i++)
        {
            for (int j = 0; j < two.length(); j++)
            {
                if (one.charAt(i) == two.charAt(j))
                {
                    counter++;
                }
            }
            if (counter == 0)
            {
                return false;
            }
            counter = 0;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();
        app.setString(firstString, secondString);
        if (app.isAnagram(app.firstString, app.secondString))
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.\n", firstString, secondString);
        }
        else
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.\n", firstString, secondString);
        }
    }
}
