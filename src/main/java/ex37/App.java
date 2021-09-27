/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex37;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class App
{
    ArrayList<String> randomPassword(ArrayList<String> password, int length, int specialChar, int digits)
    {
        ArrayList<String> letterArray = new ArrayList<String>(), specialArray = new ArrayList<String>(),
                digitArray = new ArrayList<String>();//List that our Strings go into
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", digitsString = "123456789",
                special = "!\"#$%&'-./:;<=>?@[\\]^_`{|}~";//String bank

        //adds the String in the correct list
        for (int i = 0; i < digitsString.length(); i++)
        {
            digitArray.add(String.valueOf(digitsString.charAt(i)));
        }
        for (int i = 0; i < special.length(); i++)
        {
            specialArray.add(String.valueOf(special.charAt(i)));
        }
        for (int i = 0; i < letters.length(); i++)
        {
            letterArray.add(String.valueOf(letters.charAt(i)));
        }


        Random rand = new Random();
        int digCount = 0, speCount = 0, letterCount = 0;
        //getting the random password
        for (int i = 0; i < length; i++)
        {
            int random012 = rand.nextInt(3);//chooses between special, digit, or char
            //makes sure we dont get more special then needed
            if (random012 == 0 && speCount < specialChar)
            {
                int random = rand.nextInt(specialArray.size());
                password.add(specialArray.get(random));
                speCount++;
            }
            //makes sure we dont get more digits then needed
            if (random012 == 1 && digCount < digits)
            {
                int random = rand.nextInt(digitArray.size());
                password.add(digitArray.get(random));
                digCount++;
            }
            else
            {
                int random = rand.nextInt(letterArray.size());
                password.add(letterArray.get(random));
                letterCount++;
            }
            //ensures we need as many letters and digits plus special
            if (i == length - 1 && letterCount <= digCount + speCount)
            {
                length++;
            }
        }
        return password;
    }
    void printArray (ArrayList<String> array)
    {
        //prints array
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i));
        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        //inputs
        System.out.print("What's the minimum length? ");
        int minLen = sc.nextInt();
        System.out.print("How many special characters? ");
        int maxSpecialChar = sc.nextInt();
        System.out.print("How many numbers? ");
        int numbersMax = sc.nextInt();

        ArrayList<String> randomPassword = new ArrayList<String>();
        randomPassword = app.randomPassword(randomPassword, minLen, maxSpecialChar, numbersMax);
        //printing
        System.out.print("Your password is ");
        app.printArray(randomPassword);

    }
}
