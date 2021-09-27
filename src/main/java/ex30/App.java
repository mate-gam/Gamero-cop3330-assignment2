/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex30;

public class App
{
    String multiplicationTable ()
    {
        //makes the multiplication table for 1-12
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < 13; i++)
        {
            for (int j = 1; j < 13; j++)
            {
                output.append(String.format("%-5d", i * j));
            }
            if (i != 12)
            {
                output.append("\n");
            }
        }
    return output.toString();//returns the table
    }
    public static void main (String[] args)
    {
        App app = new App();
        System.out.println(app.multiplicationTable());//prints table
    }
}
