/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex33;
import java.util.Scanner;
import java.util.Random;
public class App
{
    String randomPrint(String[] array, int random)
    {
        //returns a random spot in the array
        return array[random];
    }
    public static void main(String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //gets input
        System.out.print("What's your question? \n> ");
        String question = sc.next();
        //random array
        String[] eightBall = {"Yes", "No", "Maybe", "Ask again later."};
        int randomNumber = rand.nextInt(4); //gets random number
        //prints random output from array
        System.out.println(app.randomPrint(eightBall, randomNumber)) ;
    }
}
