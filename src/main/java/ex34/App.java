/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mateo Gamero
 */
package ex34;
import java.util.Scanner;
public class App
{
    void printArray (String[] array)
    {
        //pritns the whole array
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    String[] removeArray(String[] arrayOfNames, String[] removedIndexArray, int length, int index)
    {
        //removes the desired item out of array by copying it to another array without the index
        for(int i = 0, j = 0; i < length; i++)
        {
            if (i != index)
            {
                removedIndexArray[j++] = arrayOfNames[i];
            }
        }
        return removedIndexArray;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        //prints and inputs
        System.out.println("There are 5 employees");
        String[] arrayOfNames = {"Mateo Gamero", "John Johnny", "Jen June", "Patrick Star", "Spongebob Square"};
        app.printArray(arrayOfNames);
        System.out.print("\nEnter an employee name to remove: ");
        String name = sc.nextLine();
        int index = 0;
        //finds the index of the name in array
        for (int i = 0; i < 5; i++)
        {
            if (arrayOfNames[i].equals(name))
            {
                index = i;
            }
        }
        String[] copy = new String[4];
        //gets new array without the name
        copy = app.removeArray(arrayOfNames, copy, arrayOfNames.length, index);
        app.printArray(copy);//prints array
    }
}
