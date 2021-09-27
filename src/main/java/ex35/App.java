/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App
{
    ArrayList<String> inputName (ArrayList<String> arrayList)
    {
        Scanner sc = new Scanner(System.in);
        //gets all the names for our List
        String name;
        do {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            if (!name.equals(""))
            {
                arrayList.add(name);
            }
        }while (!name.equals(""));//stops when user enter empty name
        return arrayList;
    }
    String randomWinner (ArrayList<String> nameArray, int randomNum)
    {
        return nameArray.get(randomNum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        ArrayList<String> nameArray = new ArrayList<>();//dynamic list

        nameArray = app.inputName(nameArray);
        //finds random number
        Random rand = new Random();
        int randnum = rand.nextInt(nameArray.size());
        //gets the names at a random index of array size
        System.out.println("The winner is... " + nameArray.get(randnum));
    }
}
